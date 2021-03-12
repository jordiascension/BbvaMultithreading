package com.bbva.bolsa;

import java.util.concurrent.TimeUnit;

public class ThreadEjemplo extends Thread {
	
	String fileName;
	String url;
	
	public ThreadEjemplo(String str) {
		super(str);
	}
	
	public ThreadEjemplo(String fileName, String url) {
		super();
		this.fileName=fileName;
		this.url=url;
	}
	
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10 ; i++)
		{
			System.out.println(i + " Thread " + super.getName());
		}
	    System.out.println("Termina thread " + getName());
	}
	
}
