package com.ucloudlink.io;

import java.net.InetAddress;
import java.net.UnknownHostException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AddressMain 
{
	
	public static void main(String agrs[]) throws Exception
	{
		/*InetAddress address = InetAddress.getLocalHost();
		
		String hostAddress = address.getHostAddress();
		
		
		System.out.println(hostAddress);*/
		
		
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://127.0.0.1:8082/dubbo-admin-2.8.3/governance/applications/hello-world-app/addresses")
		  .get()
		  .addHeader("Authorization", "Basic cm9vdDpyb290")
		  .addHeader("cache-control", "no-cache")
		  .addHeader("Postman-Token", "24ea29e4-b59a-4ea1-a434-54afcfbf5abe")
		  .build();

		Response response = client.newCall(request).execute();
		
		System.out.println(response.body().string());
	}

}
