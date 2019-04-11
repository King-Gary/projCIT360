/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.io.PrintStream;

/**
 *
 * @author Gary
 */
public class Thread {
    	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// This is one way to create a thread

		MyThread mt = new MyThread();

		// We can assign a name

		mt.setName("Thread 1");

		mt.start();

		

		MyThreads2 mt2 = new MyThreads2();

		Thread t = new Thread(mt2);

		

		//New Thread

		Thread t2 = new Thread(mt2);

		Thread t3 = new Thread(mt2); 

		t.setName("Thread 2");

		t2.setName("Thread 3");

		t3.setName("Thread 4");

		t.start();

		t2.start();

		t3.start();

		

	}

    static void sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Object currentThread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Thread(MyThreads2 mt2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Thread(RatRace racer, String jonh) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setName(String thread_2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class MyThread extends Thread{

	public void run(){

		System.out.println("executing");

	}

    void setName(String thread_1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



class Thread2 implements Runnable{



	@Override

	public synchronized void run() {

            // TODO Auto-generated method stub
            Thread.sleep(1000); // TODO Auto-generated catch block
            PrintStream println = System.out.println(Thread.currentThread().getName+" "+"Thread is Running.");



	}

	

}
