/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.*;

/**
 *
 * @author Gary
 */
public class CollectList {
    
	  ArrayList<String> lst;

    public CollectList() {
        this.lst = new ArrayList<String>();
    }



	  /*Elements added to Array List*/

	  lst.add("Cat");

	  lst.add("Dog");

	  lst.add("Chair");

	  lst.add("Floor");

	  lst.add("Food");



	  /* Displaying array list*/

	  System.out.println("Array:"+lst);



	  /*Add element at the given index*/

	  lst.add(0, "Wall");

	  lst.add(1, "Couch");



	  /*Remove elements from array list like this*/

	  lst.remove("Stuff");

	  lst.remove("Dog");



	  System.out.println("Current array list is:"+lst);



	  /*Remove element from the given index*/

	  lst.remove(1);



	  System.out.println("Current array list is:"+lst);

   }
}
