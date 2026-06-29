package com.codegnan.multithreading;

public class BackupWorker implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++)
			System.out.println("Hai");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		
			
	}

}
