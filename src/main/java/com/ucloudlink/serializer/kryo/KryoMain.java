package com.ucloudlink.serializer.kryo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Output;
import com.ucloudlink.serializer.kryo.domain.BalanceBO;
import com.ucloudlink.serializer.kryo.domain.Segment;

public class KryoMain 
{
	public static void main(String args[]) throws FileNotFoundException
	{
		SegmentMap sgMap = new SegmentMap(5);
		
		for(int i=0;i<1000;i++)
		{
			BalanceBO bl = new BalanceBO();
			bl.setUserCode("liuwei_"+i);
			bl.setAmount(100);
			bl.setOrg("Presto is a distributed system that runs on a cluster of machines. A full installation includes a coordinator and multiple workers. Queries are submitted from a client such as the Presto CLI to the coordinator. The coordinator parses, analyzes and plans the query execution, then distributes the processing to the workers");
			//bl.setMsg(new byte[1024]);
			bl.setMvnoCode("Presto is targeted at analysts who expect response times ranging from sub-second to minutes. Presto breaks the false choice between having fast analytics using an expensive commercial solution or using a slow \"free\" solution that requires excessive hardware");
			bl.setOrg("Presto is a tool designed to efficiently query vast amounts of data using distributed queries. If you work with terabytes or petabytes of data, you are likely using tools that interact with Hadoop and HDFS. Presto was designed as an alternative to tools that query HDFS using pipelines of MapReduce jobs such as Hive or Pig, but Presto is not limited to accessing HDFS. Presto can be and has been extended to operate over different kinds of data sources including traditional relational databases and other data sources such as Cassandra");
			bl.setCustId("Every catalog is associated with a specific connector. If you examine a catalog configuration file, you will see that each contains a mandatory property connector.name which is used by the catalog manager to create a connector for a given catalog. It is possible to have more than one catalog use the same connector to access two different instances of a similar database. For example, if you have two Hive clusters, you can configure two catalogs in a single Presto cluster that both use the Hive connector, allowing you to query data from both Hive clusters (even within the same SQL query).");
			sgMap.put(String.valueOf(i), bl);
		}
		
		System.out.println("Map finish===============");
		
		
		
		Kryo kryo = new Kryo();
		
		kryo.register(Segment.class);
		
	    
		for(Segment sgm:sgMap.getSegments())
		{
	      String fileName = "D:/bin/file_"+sgm.getIndex()+".bin";
		  Output output = new Output(new FileOutputStream(fileName));
		

		  kryo.writeObject(output, sgm);
		
		  output.close();
		}
		
		System.out.println("finish===============");
		
	}

}
