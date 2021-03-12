package com.bbva.bolsa;

public class ArrancarThreads {

	public static void main (String [] args) {
		Thread thread1 = new ThreadEjemplo("Pepe");
		Thread thread2 = new ThreadEjemplo("Juan");
		
		thread1.start();
		thread2.start();
		System.out.println("Termina thread: " + 
							Thread.currentThread().getName());
    }
}
