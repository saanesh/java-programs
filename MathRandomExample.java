import java.util.Scanner;

public class MathRandomExample
{
    public static void main(String[] args) {
        
        Scanner my = new Scanner(System.in);
        
         System.out.println("hello welcome to my game" );
    
        System.out.println("this is a simple game");
        
                System.out.println("guess the one number and add money to win duble prize money back");
                
                System.out.println("enter number between 1 to 10");
                
                 int number = my.nextInt();
                 
               
        int min = 1;
        
        int max = 10;
        
        System.out.println("============================");
        
        System.out.println("Generating 10 random integer in range of 1 to 10 using Math.random");
        
        System.out.println("============================");
        
           System.out.println("you entered : "+ number);
       
            int randomNumber = (int) (Math.random()*(max-min)) + min;
            
            System.out.println("random number is : " +randomNumber); 
            
            if ((number==randomNumber))
            {
                   System.out.print("opps your choise is wrong");
                
            }
            else 
                System.out.print("opps your choise is wrong");
        
    }
}
 

