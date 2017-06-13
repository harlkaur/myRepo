package com.shc.thread;

class Runner extends Thread{
    boolean bExit = false;
  
    public void exit(boolean bExit){
        this.bExit = bExit;
    }
  
    @Override
    public void run(){
        while(!bExit){
            System.out.println("Thread is running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                  //  Logger.getLogger(ThreadTester.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}

class Runner2 extends Thread{
	boolean bExit = false;
	public void exit(boolean bExit){
		this.bExit = bExit;
	}
	
	@Override
	public void run(){
		while(!bExit){
			System.out.println("Thread is running");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}


class Runner3 extends Thread{
	boolean bExit = false;
	public void exit(boolean bExit){
		this.bExit = bExit;
	}
	
	@Override
	public void run(){
		while(!bExit){
			System.out.println("Thread s running");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e ){
				e.printStackTrace();
			}
		}
	}
}
