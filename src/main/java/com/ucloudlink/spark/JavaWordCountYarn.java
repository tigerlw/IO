package com.ucloudlink.spark;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import scala.Tuple2;

public class JavaWordCountYarn 
{
	private static final Pattern SPACE = Pattern.compile(" ");
	 
	static public void main(String args[])
	{
		System.setProperty("HADOOP_USER_NAME", "ec2-user");
		System.setProperty("HADOOP_PROXY_USER", "ec2-user");
		
		System.setProperty("SPARK_HOME", "D:\\learning\\spark\\spark-2.2.1-bin-hadoop2.7");
		
		
		

		SparkConf sparkConf = new SparkConf().setAppName("JavaWordCount");

		sparkConf.setMaster("yarn-client");
		sparkConf.set("spark.yarn.dist.files", "src\\main\\resources\\yarn-site.xml");
		
		sparkConf.set("spark.yarn.jars", "hdfs://appcluster/user/hadoop/*.jar");
		
		sparkConf.set("mapreduce.app-submission.cross-platform", "true");
		
		
		/*sparkConf.set("yarn.resourcemanager.address", "13.229.238.238"+":"+8032);
		sparkConf.set("yarn.resourcemanager.scheduler.address", "13.229.238.238"+":"+8030);
		sparkConf.set("yarn.resourcemanager.resource-tracker.address", "13.229.238.238"+":"+8031);*/
	/*	
		sparkConf.set("mapreduce.framework.name", "yarn");
        sparkConf.set("mapreduce.jobtracker.address", "13.229.238.238:9001");
        sparkConf.set("yarn.resourcemanager.hostname", "13.229.238.238");
        sparkConf.set("yarn.resourcemanager.admin.address", "13.229.238.238:8033");
        sparkConf.set("yarn.resourcemanager.address", "13.229.238.238:8032");
        sparkConf.set("yarn.resourcemanager.resource-tracker.address", "13.229.238.238:8031");
        sparkConf.set("yarn.resourcemanager.scheduler.address", "13.229.238.238:8030");
        sparkConf.set("yarn.resourcemanager.hostname", "13.229.238.238");*/
		
		JavaSparkContext ctx = new JavaSparkContext(sparkConf);

		JavaRDD<String> lines = ctx.textFile("hdfs://appcluster/data/input/app-01-18-2018-300.log");

		JavaRDD<String> words = lines.flatMap(s -> Arrays.asList(SPACE.split(s)).iterator());

		JavaPairRDD<String, Integer> ones = words.mapToPair(s -> new Tuple2<>(s, 1));

		JavaPairRDD<String, Integer> counts = ones.reduceByKey((i1, i2) -> i1 + i2);

		List<Tuple2<String, Integer>> output = counts.collect();
		for (Tuple2<?, ?> tuple : output) {
			System.out.println(tuple._1() + ": " + tuple._2());
		}
		ctx.stop();
	}

}
