
import java.util.*;
import java.lang.*;

public class LongestName{
          public static void main (String[] args){longestName();}


          public static void longestName(Scanner console, int n){
          String longestName=" ";
          boolean tie=false;

          String[] names=console.next().split("\n",0);
          System.out.println(names);

          for (int i=1; i<=n; i++) {
              System.out.print("name #" + i +"? ");
              if (names[i].length() > longestName.length()) 
              {longestName=(names[i].substring(0,1).toUpperCase()) + (names[i].substring(1).toLowerCase());}
              if ((names[i].length() == longestName.length())) {tie=true;}
          }

          System.out.println(longestName + "\'s name is longest");
          if (tie==true) {System.out.println("(There was a tie!");}
          }
  
  }
