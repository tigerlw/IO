package com.ucloudlink.excel.export;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

import com.ucloudlink.excel.domain.Employee;

public class ExportMain 
{
	public static void main(String args[])
	{
		List<Employee> employees = new ArrayList<Employee>();

		for (int i = 0; i < 10; i++) 
		{
			Employee employee = new Employee();
			employee.setName("liuwei");
			employee.setAddress("2222");
			employee.setAge(22);
			employee.setCountry("CN");
			employee.setTitle("yyyu");
			employees.add(employee);
		}

		try {
			InputStream is = ExportMain.class.getClassLoader().getResourceAsStream("export-temple.xlsx");
			//InputStream is = new FileInputStream("target/export-temple.xlsx");
			OutputStream os = new FileOutputStream("target/object_collection_output.xlsx");
			Context context = new Context();
			context.putVar("employees", employees);
			JxlsHelper.getInstance().processTemplate(is, os, context);
		} catch (Exception e) {
			
			System.out.println(e);

		}finally
		{
			
		}

	}

}
