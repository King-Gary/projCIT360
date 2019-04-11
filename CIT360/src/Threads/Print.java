/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Gary
 */
public class Print {
    
	private String name;

	private int length;

	public Print(String str, int length)

	{

		this.name = str;

		this.length = length;

	}

	public void run()	

	{

	System.out.println(name+" started");

	for (int i=0; i<length; i++)

	{

		try{Thread.sleep(1000);}catch(Exception e){}

	}

	System.out.println(name+" completed");

	}
}
