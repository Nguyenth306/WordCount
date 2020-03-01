import java.util.*;

public class WordCount{
   public static void main (String[] args){
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter A Sentence: ");
      String s = kbd.nextLine();
      System.out.println("Numbers of Words: " + wordCount(s));  
   }
   public static int wordCount(String s){  
      String[] list = s.split(" ");
      return(list.length);
       
   }
}