package com.codegnan.multithreading;

public class YieldExample {

	public static void main(String[] args) {
		BackupWorker backupTask1 = new BackupWorker();
		//BackupWorker backupTask2 = new BackupWorker("Backup-Worker-B");
		Thread workerA = new Thread(backupTask1);
		//Thread workerB = new Thread(backupTask2);
		//workerA.setPriority(Thread.NORM_PRIORITY);
		//workerB.setPriority(Thread.NORM_PRIORITY);
		//System.out.println("Starting Backup Workers");
		workerA.start();
		try {
			workerA.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		//workerB.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}

}
