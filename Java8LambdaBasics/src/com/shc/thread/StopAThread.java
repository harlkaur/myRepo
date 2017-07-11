package com.shc.thread;

public class StopAThread extends Thread {

	boolean bExit = false;

	public StopAThread(boolean bExit) {
		this.bExit = bExit;
	}

	@Override
	public void run() {

		while(!bExit){
			System.out.println("Thread is running");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

/*class Runner14 extends Thread{
	
	boolean exit = false;
	public Runner14(boolean exit){
		this.exit = exit;
	}
	
	@Override
	public void run(){
		while(!exit){
			System.out.println("Thread s running");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}*/