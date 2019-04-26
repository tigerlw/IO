package com.ucloudlink.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.ucloudlink.lambda.collect.FlowLogCollector;
import com.ucloudlink.lambda.domain.FlowLog;

public class IteratorMain 
{
	private static final Pattern SPACE = Pattern.compile(",");
	
	public static void main(String args[])
	{
		List<String> msg = Arrays.asList("1,a","2,b","3,c","4,d","5,a");
		
		String result = msg.stream().flatMap((x)->{
			return Arrays.asList(SPACE.split(x)).stream();
		}).filter((x) -> {
			return true;
		}).reduce((x,y)->{
			return x + y;
		}).get();
		
		System.out.println(result);

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result1 = items.stream()
				.collect(Collectors.groupingBy(x ->{
					return String.valueOf(x.charAt(0));
				}, Collectors.counting()));

		System.out.println(result1);
		
		
		Map<String, Long> result2 = msg.stream().collect(Collectors.groupingBy(x ->{
			String y = SPACE.split(x)[1];
			return y;
		},  Collectors.summingLong((x)->{
			long y = Long.valueOf(SPACE.split(x)[0]);
			return y;
		})));
		
		System.out.println(result2);
		
		List<FlowLog> Flowlogs = new ArrayList<FlowLog>();
		Flowlogs.add(new FlowLog("liuwei","1","CN",100));
		Flowlogs.add(new FlowLog("liuwei","1","CN",200));
		Flowlogs.add(new FlowLog("liuwei","2","CN",200));
		
		Map<FlowLog, Double> result3 = Flowlogs.stream().collect(Collectors.groupingBy((x)->{
			FlowLog flowLog = (FlowLog) x;
			return flowLog;
		}, Collectors.summingDouble((x)->{
			FlowLog flowLog = (FlowLog) x;
			return flowLog.getFlowSize();
		})));
		
		
		System.out.println(result3);
		
		Map<FlowLog,FlowLog> result4 = Flowlogs.stream().collect(new FlowLogCollector());
	    
		for(Entry<FlowLog, FlowLog> entry :result4.entrySet())
		{
			System.out.println(entry.getValue());
		}
		
	}
	
	

}
