/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

/**
 *
 * @author Gary
 */
public class Person implements java.io.Serializable{
    public String name;

   public String major;

   public String cell;

   public void mailCheck()

   {

      System.out.println("The Person'sn Information is " + name

                           + " " + major);

   }
}
