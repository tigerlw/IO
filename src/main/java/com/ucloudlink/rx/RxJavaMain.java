package com.ucloudlink.rx;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observers.SafeSubscriber;

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
				
				observer.onNext("==================================================="+param);
				observer.onCompleted();
			}
		});
		
		observableString.subscribe(new ObserverT("liuwei"));
		observableString.subscribe(new ObserverT("liuwei123"));
		
		
		

	}
	
	
	static public class ObserverT extends Subscriber<String>
	{
		private String param ;
		
		public ObserverT(String param) 
		{
			this.setParam(param);
		}
		
		
		@Override
		public void onCompleted() {
			System.out.println("Observable completed");
		}

		@Override
		public void onError(Throwable e) {
			System.out.println("Oh no! Something wrong happened!");
		}

		@Override
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
