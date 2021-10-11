import java.util.Scanner;
public class Playermax{
 
  public static void main(String[] args){
    Scanner in= new Scanner(System.in);
     
    System.out.println("Hello!");
    System.out.println("Player 1: Enter your username");
    String name1=in.next();
    System.out.println("Player 2: Enter your username");
    String name2=in.next();
    
    boolean play=true;
    int count=0;
    
    
      Board b1= new Board();
      b1.create();
    System.out.println("Please choose what row you would like to choose");
    System.out.println(b1);
   /* while(play){
      count++;
      if(count%2==0){
        player1();
      }
      else if(count%2!=0){
        player2();
      }
      
    }*/
  }
}
    
  //public static int player1(){
  
    ///return 0;
 // }
 // public static int player2(){
    //return 0;
  //}
    
    
      
  //}
  











































