/*
 * 
 */
package lesson3.task4;

import java.util.Scanner;

public class UngeradeZahlen
{
   public static void main (String[] args)
   {
      int startwert, endwert;
      Scanner scan = new Scanner (System.in);

      System.out.println ("Dieses Programm gibt alle " +
                          "ungeraden Zahlen zwischen " +
                          "dem Startwert und Endwert aus.");
      System.out.print ("Gib den Startwert ein: ");
      startwert = scan.nextInt();

      do
      {
         System.out.print ("Gib den Endwert ein: ");
         endwert = scan.nextInt();
         System.out.println();
      } while (endwert < startwert);

      
      // task 4a
      for (int i = startwert; i <= endwert; i++)
      {
         if(i%2 == 0) {
        	 continue;
         }
         
         System.out.println ("Die Zahl " + i + " ist ungerade!");
      }
      
      // task 4b
      int i = 0;
      
      while(i <= endwert) {
    	  
    	  if(i%2 == 0) {
    		 i++;
         	 continue;
          }
    	  
    	  System.out.println ("Die Zahl " + i + " ist ungerade!");
    	  
    	  i++;
      }
   }
}
