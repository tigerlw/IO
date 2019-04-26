package com.ucloudlink.s3;

import java.io.File;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class MainS3 
{
	public static void main(String args[])
	{
		AWSCredentials credentials = new BasicAWSCredentials("AKIAJZDOKGU47IUUSZ7A", "lBAPmdscUn+Lj4mexgxpvUDiAX+ubSpHkrAu6XSl");
		AmazonS3 s3client = new AmazonS3Client(credentials);
		s3client.setRegion(Region.getRegion(Regions.US_EAST_1));
		
		for (Bucket bucket : s3client.listBuckets()) {
			System.out.println(" - " + bucket.getName());
		}
		
/*
		s3client.putObject(new PutObjectRequest("picture-bak", "123.jpg", 
				new File("C:\\Users\\Public\\Pictures\\Desert.jpg")));*/

	}

}
