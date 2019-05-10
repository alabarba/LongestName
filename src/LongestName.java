
import java.util.*;
import java.lang.*;

public class LongestName{
    
	public static void main (String[] args){
	String inputNames="";
	System.out.print("Please insert the number of names ");
    Scanner input = new Scanner(System.in);
    int numberOfNames=input.nextInt();
    for(int i =1; i<=numberOfNames; i++) {
    	System.out.print("name #" + i +"? ");
    	Scanner console= new Scanner(System.in);
    	inputNames=inputNames + console.next() +"," ;
    	//console.close(); To be understood why closing the Scanner object breaks the code.
    	}
    Scanner s = new Scanner(inputNames).useDelimiter(",");
    longestN(s,numberOfNames);
	}
    
          public static void longestN(Scanner console, int n){
          String longestName=" ";
          boolean tie=false;

          for (int i=1; i<=n; i++) {
        	  String a=console.next();
        	  if (a.length() == longestName.length()) {tie=true;}
        	  if (a.length() > longestName.length()) 
              {longestName=a;}       
          }

          System.out.println(longestName + "\'s name is longest");
          if (tie==true) {System.out.println("(There was a tie!)");}
          }
 
  }

