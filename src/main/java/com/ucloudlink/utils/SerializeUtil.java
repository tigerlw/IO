package com.ucloudlink.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;


/**
 * 序列化工具类
 * @author liuwei
 *
 */
public class SerializeUtil
{
	//private static Logger logger = LoggerFactory.getLogger(SerializeUtil.class);
	
	//private static OssLogger osslogger = OssLogger.getLogger(SerializeUtil.class);
	
	private static ObjectMapper om = new ObjectMapper();

	/**
	 * 反序列化
	 * 
	 * @param bytes
	 * @return
	 */
	public static <T> T unserialize(byte[] bytes, Class<T> entityClass)
	{
		ByteArrayInputStream bais = null;
		try
		{
			bais = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bais);
			return (T) ois.readObject();
		} catch (Exception e)
		{
			//logger.error(e.toString());
		}
		return null;
	}

	/**
	 * 序列化
	 * 
	 * @param object
	 * @return
	 */
	public static byte[] serialize(Object object)
	{
		ObjectOutputStream oos = null;
		ByteArrayOutputStream baos = null;
		try
		{

			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(object);
			byte[] bytes = baos.toByteArray();
			return bytes;
		} catch (Exception e)
		{
			//logger.error(e.toString());
		}
		return null;
	}

	/**
	 * 对象序列化为字符串
	 * 
	 * @param object
	 * @return
	 */
	public static String jsonSerialize(Object object)
	{
		String result = "";

	

		//ByteArrayOutputStream out = new ByteArrayOutputStream();

		try
		{
			/*JsonGenerator gener = om.getJsonFactory().createJsonGenerator(out);
			gener.writeObject(object);
			result = out.toString();*/
			
			result = JSON.toJSONString(object);

			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			//logger.error(e.toString());
		}
		

		return result;
	}

	/**
	 * json串序列化为对象
	 * 
	 * @param jsonStr
	 * @param entityClass
	 * @return
	 */
	public static <T> T jsonUnSerialize(String jsonStr, Class<T> entityClass)
	{

		T result = null;
		
		try {
			
			if(!StringUtils.isEmpty(jsonStr)){
				result = JSON.parseObject(jsonStr, entityClass);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//logger.error(ExceptionUtils.getFullStackTrace(e));
		}

		return result;
	
	}

	
	/**
	 * FastJson反序列化为对象
	 * @param bytes
	 * @return
	 */
	public static Object jsondeserialize(byte[] bytes) {
		if (bytes == null || bytes.length == 0) {
			return null;
		}
		return JSON.parse(bytes);
	}
	
	/**
	 * FastJson 序列化 对象为byte数组
	 * @param obj
	 * @return
	 */
	public static byte[] jsonserialize(Object obj) {
		try {
			return JSON.toJSONBytes(obj, SerializerFeature.WriteClassName);
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}

}
