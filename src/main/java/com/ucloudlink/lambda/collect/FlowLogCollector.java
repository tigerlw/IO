package com.ucloudlink.lambda.collect;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import com.ucloudlink.lambda.domain.FlowLog;

public class FlowLogCollector implements Collector<FlowLog, Map<FlowLog,FlowLog>, Map<FlowLog,FlowLog>>
{

	@Override
	public Supplier<Map<FlowLog, FlowLog>> supplier() {
		// TODO Auto-generated method stub
		Supplier<Map<FlowLog, FlowLog>> supplier =()-> new HashMap<FlowLog, FlowLog>();
		
		return supplier;
	}

	@Override
	public BiConsumer<Map<FlowLog, FlowLog>, FlowLog> accumulator() {
		// TODO Auto-generated method stub
		BiConsumer<Map<FlowLog, FlowLog>, FlowLog> accumulator = (t,u) ->
		{
			FlowLog target = t.get(u);
			
			if(target == null)
			{
				t.put(u, u);
			}else
			{
				target.setFlowSize(target.getFlowSize()+u.getFlowSize());
			}
			
			
			
		};
		
		return accumulator;
	}

	@Override
	public BinaryOperator<Map<FlowLog, FlowLog>> combiner() {
		// TODO Auto-generated method stub
		
		BinaryOperator<Map<FlowLog, FlowLog>> combiner = (a,b) ->
		{
			a.putAll(b);
			
			return a;
		};
		
		return combiner;
	}

	@Override
	public Function<Map<FlowLog, FlowLog>, Map<FlowLog,FlowLog>> finisher() {
		// TODO Auto-generated method stub
		/*Function<Map<FlowLog, FlowLog>, Map<FlowLog,FlowLog>> finisher = (t) ->{
			
			return t;
		};*/
		
		return Function.identity();
	}

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		// TODO Auto-generated method stub
		return Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
	}

}
