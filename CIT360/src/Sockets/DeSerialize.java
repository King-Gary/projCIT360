/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;
import java.io.*;
/**
 *
 * @author Gary
 */
public class DeSerialize {
       public static void main(String [] args)

   {

      Person s = null;

      try

      {

         FileInputStream fileIn = new FileInputStream("/Users/jonathangrajales/Desktop/SomePerson.html");

         ObjectInputStream in = new ObjectInputStream(fileIn);

         s = (Person) in.readObject();

         in.close();

         fileIn.close();

      }catch(IOException i)

      {

         i.printStackTrace();

         return;

      }catch(ClassNotFoundException c)

      {

         System.out.println("SomePerson class not found");

         c.printStackTrace();

         return;

      }

      System.out.println("Person Information:");

      System.out.println("Name: " + s.name);

      System.out.println("major: " + s.major);

      System.out.println("Cell: " + s.cell);

    }
}
