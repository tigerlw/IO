package com.ucloudlink.rx;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observers.SafeSubscriber;
import rx.schedulers.Schedulers;

public class RxJavaMain 
{
	public static void main(String args[])
	{
		Observable<String> observableString = Observable.create(new Observable.OnSubscribe<String>() {
			public void call(Subscriber<? super String> observer) {

			
				String param = "?";
				if(observer instanceof SafeSubscriber)
				{
					Subscriber subs = ((SafeSubscriber)observer).getActual();
					
					if(subs instanceof ObserverT)
					{
						param = ((ObserverT) subs).getParam();
					}
				}
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				observer.onNext(Thread.currentThread().getName()+"==================================================="+param);
				observer.onCompleted();
			}
		}).subscribeOn(Schedulers.newThread());
		
		observableString.subscribe(new ObserverT("liuwei"));
		observableString.subscribe(new ObserverT("liuwei123"));
		
		System.out.println("exit");
		

	}
	
	
	static public class ObserverT extends Subscriber<String>
	{
		private String param ;
		
		public ObserverT(String param) 
		{
			this.setParam(param);
		}
		
		
		//@Override
		public void onCompleted() {
			System.out.println("Observable completed");
		}

		//@Override
		public void onError(Throwable e) {
			System.out.println("Oh no! Something wrong happened!");
		}

		//@Override
		public void onNext(String message) {

			System.out.println(message);
		}

	


		public String getParam() {
			return param;
		}



		public void setParam(String param) {
			this.param = param;
		}



		
	}

}
