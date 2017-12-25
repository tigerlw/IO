package com.ucloudlink.rx;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.ucloudlink.rx.RxJavaMain.ObserverT;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observers.SafeSubscriber;

public class RxjavaListMain 
{
	
	public static void main(String args[])
	{
		final Object flag = new Object();
		final List<String> items = new ArrayList<String>();
		
		
		//Observable<Integer> observableString = Observable.from(items);
		
		
		
		
		final Observable<String> observableString = Observable.create(new Observable.OnSubscribe<String>() {
			public void call(Subscriber<? super String> observer) {

				int count = 0;
				while (true) {

					List<String> newItem = items.subList(count, items.size());

					for (String item : newItem) {
						observer.onNext(item);
						count++;
					}

					try {
						synchronized (flag) {
							flag.wait();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				// observer.onCompleted();
			}
		});
		
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {

				//@Override
				public void run() {
					// TODO Auto-generated method stub

					observableString.subscribe(new Observer<String>() {

						//@Override
						public void onCompleted() {
							// TODO Auto-generated method stub
							System.out.println("complete============");
						}

						//@Override
						public void onError(Throwable e) {
							// TODO Auto-generated method stub

						}

						//@Override
						public void onNext(String t) {
							// TODO Auto-generated method stub
							System.out.println(t);
						}

					});
				}

			}).start();
		}
		
		//new Thread(new ObservableRunnable(observableString,items,flag)).start();
		
		
	/*	try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		//items.add(1);
		
		try {
			
			while(true)
			{

				Scanner sc = new Scanner(System.in);
				String name = sc.nextLine();

				items.add(name);

				synchronized (flag) {
					flag.notifyAll();
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	/*	new Thread(new Runnable(){

			//@Override
			public void run() {
				// TODO Auto-generated method stub
				items.add("liuwei");
				
				synchronized (flag) {
					flag.notifyAll();
				}
			}
			
		}).start();*/
		
		
		
		//items.add(2);
		
		/*while(true)
		{
			
		}*/
		
		
	}
	
	static public class ObservableRunnable implements Runnable
	{
	    private Observable<String> ob;
		
		final private List<String> items;
		
		final private Object flag;
		
		public ObservableRunnable(Observable<String> ob,List<String> items,Object flag)
		{
			this.ob = ob;
			this.flag = flag;
			this.items = items;
		}

		//@Override
		public void run() {
			// TODO Auto-generated method stub
			ob = Observable.create(new Observable.OnSubscribe<String>() {
				public void call(Subscriber<? super String> observer) {

					int count = 0;
					while (true) {
						
						List<String> newItem = items.subList(count, items.size());
						
						for (String item : newItem) {
							observer.onNext(item);
							count ++;
						}
						
						try {
							synchronized (flag) {
								flag.wait();
							}
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					// observer.onCompleted();
				}
			});
			
			
			
			for (int i = 0; i < 2; i++) {
				new Thread(new Runnable() {

					//@Override
					public void run() {
						// TODO Auto-generated method stub

						ob.subscribe(new Observer<String>() {

							//@Override
							public void onCompleted() {
								// TODO Auto-generated method stub
								System.out.println("complete============");
							}

							//@Override
							public void onError(Throwable e) {
								// TODO Auto-generated method stub

							}

							//@Override
							public void onNext(String t) {
								// TODO Auto-generated method stub
								System.out.println(t);
							}

						});
					}

				}).start();
			}
			
		}
		
	}

}
