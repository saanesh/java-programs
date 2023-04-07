import java.util.Scanner;
public class ArrayTest {

    
    public static void main(String[] args) {
       int n;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        n=sc.nextInt();
        String [] str =new String[10];
        System.out.println("enter the elements of array ");
        for (int i = 0; i < n; i++) {
            str[i]=sc.nextLine();
            
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
            
        }
        System.out.println(str.length);
        String []city =new String[5];
      city[0]="bankhed";
     city[1]="pipariya";
       city[2]="bopal";
         city[3]="itarsi" ;
         city[4]="indore";
         
            for (int i =0 ; i < city.length; i++) 
            {
               System.out.println(city[i]);
                System.out.println(city.length);}
        }
         /* this is for int
          
              int[] array = {1, 2, 3, 4, 5};

        for (int element: array) {
            System.out.println(element);
            
            */
         /* exmle******* string ******
            for (String str : city)
         Example******int***********
                for (int element: array) 
         yese hi sabke liye bana sakte bs data type dalna h or uske ek verable bana hai phir apne array ka naam likhna 
         : duble doat laga kar 
         
          /*there is simple one more wau to print elements of array this is for string veriable
         city[0] = "Delhi";  
          city[1] = "Jaipur";  
          city[2] = "Gujarat";  
          city[3] = "Mumbai";  
           traversing over array using for-each loop   
           for (String str : city)   
           {  
           System.out.println(str);  */
          
          /*
          2
           int[] arr = { -7, -5, 5, 10, 0, 3, 20, 25, 12 };
  
        System.out.print("Elements of given array are: ");
  
        // Pass the array 'arr' in Arrays.toString()
        // function to print array
        System.out.println(Arrays.toString(arr));
          */
         /*
          4 For each loop
           Int []={10,20,30,40,50};  
     System.out.println("The elements in the array are:");  
     for(Int i:myArray)        
        System.out.print(i + " ");  
          */
    }
    

 