// simple program

/* is this program this  example is polymorephishm method overloading 
polym... are to types method overl. and overrding 
*/

public class Poly {
    
    void sum()
    {
    int a= 10+10;
    int b= 20+20;
        System.out.println(a+b);
    }
    void sum(int a)
    {
     int c= 10+20;
    int d= 20+40;
        System.out.println(c+d);
        
    }
    
    public static void main(String[] args) {
        
        Poly s =new Poly();
        s.sum(4);
    }

    
}
