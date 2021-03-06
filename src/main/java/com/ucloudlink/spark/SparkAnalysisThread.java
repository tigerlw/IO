package com.ucloudlink.spark;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.storage.StorageLevel;

import scala.Tuple2;

public class SparkAnalysisThread 
{
    private static final Pattern SPACE = Pattern.compile(" ");
	
	private static final Pattern colon = Pattern.compile(":");
	
    static public void main(String args[])
    {

    	SparkConf sparkConf = new SparkConf().setAppName("JavaAnalysis").setMaster("local");
		JavaSparkContext ctx = new JavaSparkContext(sparkConf);
		JavaRDD<String> lines = ctx.textFile("D:/logs/new/app-06-11-2018-9.log", 1);
		
		JavaRDD<String> msg = lines.filter(s->s.contains("flowLog queue execute end"));
		
		JavaRDD<String> words = msg.flatMap(t->Arrays.asList(SPACE.split(t)).iterator());
		
		
		JavaPairRDD<String, Integer> waste = words.filter(s -> s.contains("flow_execute_thread")).mapToPair(s -> {
			
			return new Tuple2<String, Integer>(s, 1);
		}).persist(StorageLevel.MEMORY_ONLY());
		
		
		//long count  = waste.count();
		
		
		JavaPairRDD<String, Integer> totalTime = waste.reduceByKey((i1,i2)->i1+i2);
		
		
		List<Tuple2<String, Integer>> output = totalTime.collect();
		
		for (Tuple2<String, Integer> tuple : output) {
			
			//System.out.println("count:"+count+";total:"+tuple._2());
			
			System.out.println(tuple._1() + ": " + tuple._2());
		}
		
		ctx.stop();
		
		
		
    
    }
}
