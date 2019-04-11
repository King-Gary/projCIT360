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
public class Serialize {
    public static void main(String [] args)

   {

      Person s = new Person();

      s.name = "Gary";

      s.major = "CIT";

      s.cell = "123456789";

      try

      {

        //Serializing Data 

        FileOutputStream fileOut =

              new FileOutputStream("/Users/jonathangrajales/Desktop/SomePerson.html");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(s);

        out.close();

        fileOut.close();

        System.out.printf("Data has been transferred to Desktop");

        

      }catch(IOException i)

      {

          i.printStackTrace();

      }

   }
}
