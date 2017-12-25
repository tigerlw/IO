package com.ucloudlink.akka.main;

import java.util.Scanner;

import com.ucloudlink.akka.actor.GreetActor;
import com.ucloudlink.akka.actor.RouterActor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.routing.RoundRobinPool;

public class RouterActorMain 
{
	public static void main(String args[])
	{
		ActorSystem system = ActorSystem.create("RouterActor");
		
		ActorRef routee = system
				.actorOf(
						new RoundRobinPool(20).props(Props.create(RouterActor.class)
								.withDispatcher("akka.blocking-io-dispatcher").withMailbox("akka.bounded-mailbox")),
						"greet");
		
		
		while(true)
		{
			
		  /* System.out.println("in:");
		   Scanner s = new Scanner(System.in);
		   
		   String msg = s.next();*/
			
		   routee.tell("5555", null);
		}
	}

}
