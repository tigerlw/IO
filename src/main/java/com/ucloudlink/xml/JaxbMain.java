package com.ucloudlink.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class JaxbMain 
{
	public static void main(String args[])
	{
		readFile();
	}
	
	public static void readFile()
	{
		File file = new File("E:\\person.xml");
		JAXBContext jc = null;
		try {
			jc = JAXBContext.newInstance(Person.class);
			Unmarshaller uma = jc.createUnmarshaller();
			Person person = (Person) uma.unmarshal(file);
			System.out.println(person);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile()
	{
		Person person = new Person("abc", "男", "北京", "朝阳区");
		 
        File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            //根据Person类生成上下文对象
            jc = JAXBContext.newInstance(Person.class);
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
            ma.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
	}
	

	@XmlRootElement
	public static class Person 
	{
		private int id;
		private String name;
		private String gender;
		private String addr;

		private String area;

		public Person() 
		{
			
		}

		public Person(String name, String gender, String addr, String area) {
			this.name = name;
			this.gender = gender;
			this.addr = addr;
			this.area = area;
		}

		public int getId() {
			return id;
		}

		@XmlElement
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		@XmlElement
		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		@XmlElement
		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddr() {
			return addr;
		}

		@XmlElement
		public void setAddr(String addr) {
			this.addr = addr;
		}

		public String getArea() {
			return area;
		}

		@XmlElement
		public void setArea(String area) {
			this.area = area;
		}

		@Override
		public String toString() {
			return "Person{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + ", addr='" + addr
					+ '\'' + ", area='" + area + '\'' + '}';
		}
	}

}
