package com.ucloudlink.rx;

import java.util.concurrent.atomic.AtomicLong;

import rx.Observer;
import rx.subjects.PublishSubject;

public class PublishSubjectMain 
{
	public static void main(String args[])
	{
		PublishSubject<String> stringPublishSubject = PublishSubject.create();
		
		stringPublishSubject.subscribe(new Observer<String>(){

			private AtomicLong count = new AtomicLong(0);
			
			//@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}

			//@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}

			//@Override
			public void onNext(String t) {
				// TODO Auto-generated method stub
				System.out.println(t+"========"+count.incrementAndGet());
			}
			
		});
		
		stringPublishSubject.subscribe(new Observer<String>(){

			private AtomicLong count = new AtomicLong(0);
			
			//@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}

			//@Override
			public void onError(Throwable e) {
				// TODO Auto-generated method stub
				
			}

			//@Override
			public void onNext(String t) {
				// TODO Auto-generated method stub
				System.out.println(t+"========"+count.incrementAndGet());
			}
			
		});
		
		stringPublishSubject.onNext("liuwei");
		stringPublishSubject.onNext("liuwei2");
		
		
	}

}
