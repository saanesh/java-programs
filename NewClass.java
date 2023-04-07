

public class NewClass
{
static int sum(int...arr)
{
int result =0;
for(int a:arr){
    result+=a;
    
}
return result;
}

public static void main(String[] args) {
    System.out.println("the sum of 4 5 6 is : " + sum(4,5,6));
 
}



}