package com.ucloudlink.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.ucloudlink.xml.JaxbMain.Person;
import com.ucloudlink.xml.model.Transformation;

public class JaxbKettleTrans 
{
	public static void main(String args[])
	{
		File file = new File("D:\\learning\\kettle\\jobs\\testdb_trans.ktr");
		File fileCp = new File("D:\\learning\\kettle\\jobs\\testdb_trans_cp.ktr");
		
		JAXBContext jc = null;
		try {
			jc = JAXBContext.newInstance(Transformation.class);
			Unmarshaller uma = jc.createUnmarshaller();
			Transformation trans = (Transformation) uma.unmarshal(file);
			System.out.println("read finish");
			
			trans.getInfo().get(0).setName("liuwei");
			
			Iterator<Transformation.Step> steps = trans.getStep().iterator();
			
			while(steps.hasNext())
			{
				Transformation.Step step = steps.next();
				if("TableInput".equals(step.getType()))
				{
					String sql = "SELECT msg,msgcount FROM t_msg where msg='123'";
					step.setSql(sql);
					continue;
				}
				
				if("TextFileOutput".equals(step.getType()))
				{
					continue;
				}
				
				steps.remove();
				
			}
			
			
			
			
			Transformation.Order order = trans.getOrder().get(0);
			
			Iterator<Transformation.Order.Hop> hops = order.getHop().iterator();
			
			while(hops.hasNext())
			{
				Transformation.Order.Hop hop = hops.next();
				
				if(!"表输入".equals(hop.getFrom()))
				{
					hops.remove();
				}
			}
			
			 //根据Person类生成上下文对象
            jc = JAXBContext.newInstance(Transformation.class);
            //从上下文中获取Marshaller对象，用作将bean编组(转换)为xml
            Marshaller ma = jc.createMarshaller();
            //以下是为生成xml做的一些配置
            //格式化输出，即按标签自动换行，否则就是一行输出
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //设置编码（默认编码就是utf-8）
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            //是否省略xml头信息，默认不省略（false）
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);
 
            //编组
            ma.marshal(trans, fileCp);
            
            
            System.out.println("copy finish");
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	@XmlRootElement(name = "transformation")
	public static class Trans
	{
		private Info info;
		
		private String connection;
		
		public Trans()
		{
			
		}
		
		public Trans(Info info,String connection)
		{
			this.info = info;
			this.setConnection(connection);
		}

		public Info getInfo() {
			return info;
		}

		@XmlElement
		public void setInfo(Info info) {
			this.info = info;
		}

		public String getConnection() {
			return connection;
		}

		@XmlElement
		public void setConnection(String connection) {
			this.connection = connection;
		}
		
		@Override
		public String toString()
		{
			return "info:" + info + "; connection:" + connection;
		}
	}
	
	public static class Info
	{
		private String name;
		
		public Info()
		{
			
		}

		public String getName() {
			return name;
		}

		@XmlElement
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString()
		{
			return "name:" + name;
		}
	}

}
