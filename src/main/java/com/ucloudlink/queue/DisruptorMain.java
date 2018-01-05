package com.ucloudlink.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

public class DisruptorMain 
{
    static public class LongEvent
	{
	    private long value;

	    public void set(long value)
	    {
	        this.value = value;
	    }
	    
	    public long getValue()
	    {
	    	return this.value;
	    }
	}
    
    static public class LongEventFactory implements EventFactory<LongEvent>
    {
        public LongEvent newInstance()
        {
            return new LongEvent();
        }
    }
    
    static public class LongEventHandlerF implements EventHandler<LongEvent>
    {
    	 public void onEvent(LongEvent event, long sequence, boolean endOfBatch)
         {
             System.out.println("First: " + event.getValue()+"; "+ Thread.currentThread().getName());
             
         }
    }
    
    static public class LongEventHandlerS implements EventHandler<LongEvent>
    {
    	 public void onEvent(LongEvent event, long sequence, boolean endOfBatch)
         {
             System.out.println("First: " + event.getValue()+"; "+ Thread.currentThread().getName());
             
         }
    }
    
    static public class LongEventHandler implements EventHandler<LongEvent>
    {
    	private RingBuffer<LongEvent> ringBuffer;
    	
    	public LongEventHandler()
    	{
    		EventFactory<LongEvent> eventFactory = new ResultEventFactory();
        	ExecutorService executor = Executors.newSingleThreadExecutor();
        	int ringBufferSize = 1024 * 1024; // RingBuffer 大小，必须是 2 的 N 次方；
        	        
        	Disruptor<LongEvent> disruptor = new Disruptor<LongEvent>(eventFactory,
        	                ringBufferSize, executor, ProducerType.SINGLE,
        	                new YieldingWaitStrategy());
        	        
        	EventHandler<LongEvent> eventHandler = new ResultEventHandler();
        	disruptor.handleEventsWith(eventHandler);
        	
        	this.ringBuffer = disruptor.getRingBuffer();
        	        
        	disruptor.start();
    	}
    	
        public void onEvent(LongEvent event, long sequence, boolean endOfBatch)
        {
            System.out.println("Event: " + event.getValue()+"; "+ Thread.currentThread().getName());
            Translator TRANSLATOR = new Translator();
            ringBuffer.publishEvent(TRANSLATOR, event.getValue());
            
        }
    }
    
    static public class ResultEventFactory implements EventFactory<LongEvent>
    {
        public LongEvent newInstance()
        {
            return new LongEvent();
        }
    }
    
    static public class ResultEventHandler implements EventHandler<LongEvent>
    {

		
		public void onEvent(LongEvent event, long sequence, boolean endOfBatch)
		{
			// TODO Auto-generated method stub
			System.out.println("Result: " + event.getValue()+"; "+ Thread.currentThread().getName());
		}
    	
    }
    
    static class Translator implements EventTranslatorOneArg<LongEvent, Long>
    {
        @Override
        public void translateTo(LongEvent event, long sequence, Long data) {
            event.set(data);
        }    
    }
    
    public static void main(String args[])
    {
    	EventFactory<LongEvent> eventFactory = new LongEventFactory();
    	ExecutorService executor = Executors.newCachedThreadPool();
    	int ringBufferSize = 1024 * 1024; // RingBuffer 大小，必须是 2 的 N 次方；
    	        
    	Disruptor<LongEvent> disruptor = new Disruptor<LongEvent>(eventFactory,
    	                ringBufferSize, executor, ProducerType.MULTI,
    	                new YieldingWaitStrategy());
    	        
    	EventHandler<LongEvent> eventHandler = new LongEventHandler();
    	EventHandler<LongEvent> eventHandlerF = new LongEventHandlerF();
    	disruptor.handleEventsWith(eventHandlerF).then(eventHandler);
    	        
    	disruptor.start();
    	
    	
    	ExecutorService executor2 = Executors.newFixedThreadPool(2);
    	
    	for(long i=0;i<2;i++)
		{
    		final long input = i;
			executor2.execute(new Runnable() 
			{

				@Override
				public void run() {
					// TODO Auto-generated method stub

					RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();

					Translator TRANSLATOR = new Translator();

					while (true) {
						/*
						 * long sequence = ringBuffer.next();//请求下一个事件序号； try {
						 * 
						 * LongEvent event = ringBuffer.get(sequence);//
						 * 获取该序号对应的事件对象； long data = 123L;// 获取要通过事件传递的业务数据；
						 * event.set(data); } finally {
						 * ringBuffer.publish(sequence);// 发布事件； }
						 */

						long data = input;
						ringBuffer.publishEvent(TRANSLATOR, data);
					}

				}

			});
		}
    	
    	
    	
    	
    	
    	/*disruptor.shutdown();
    	executor.shutdown();*/
    	
    }

}
