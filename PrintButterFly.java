import java.util.Scanner;
public class PrintButterFly {
       // create drawButterflyPattern() method that will print Butterfly over n rows  
    public static void drawButterflyPattern(int N) {  
        // declare and initialize variables that helps to print Butterfly pattern  
        int space = 2*N-1;  
        int star = 0;  
        // use for loop   
                for(int j = 1; j <= 2*N-1; j++){  
                        if(j <= N){  
                            space = space - 2;  
                            star++;  
                        }  
                        else {  
                            space = space + 2;  
                            star--;  
                        }  
            // use for loop to print star  
                        for(int m = 1; m <= star; m++){  
                         System.out.print("*");  
                        }  
            // use for loop to print space  
                        for(int n = 1; n <= space; n++){  
                            System.out.print(" ");  
                        }  
            // use for loop to print star for special case  
                        for(int p = 1; p <= star; p++){  
                            if(p != N){  
                    System.out.print("*");  
                }  
                        }  
                        System.out.println();  
                }  
    }  
    // main() method start  
        public static void main(String[] args) {  
        int N;  
        // create Scanner class object to take input from user  
             Scanner sc = new Scanner(System.in);  
                System.out.println("Enter value of N");  
        N = sc.nextInt();  
        // close scanner class object  
      
        // call drawButterflyPattern() method   
        drawButterflyPattern(N);  
        }
        }
        
        /*
        
                   *        * 
                   **      ** 
                   * *    * * 
                   *  *  *  * 
                   *   **   * 
                   *   **   * 
                   *  *  *  * 
*                  * *    * * 
*                  **      ** 
                   *        * 
        
          int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print("*");
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print("*");
            System.out.println(" ");
        }
        }  
}  

*/