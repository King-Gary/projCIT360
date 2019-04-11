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
public class RatRace {
    
	public static void main(String[]args){

		RatRace racer = new RatRace();

		Thread jonhThread = new Thread(racer,"Gary");

		Thread steveThread = new Thread(racer,"Josh");

		

		//Race to start, tell threads to start

		

		jonhThread.start();

		steveThread.start();

	}
}
