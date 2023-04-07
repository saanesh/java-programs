/*all types of inhertance in this one programm
java does not support mulple and hybride. inheritance java support only 
single leve 
multi level 
hiercle inheritance 
*/



class vivo {
    
     void func()
    {
    
        System.out.println("camera 24mp");
        System.out.println("front camera 16mp");
    
    }
    void sim()
    {
    
        System.out.println("dual sim slote 5g supported");
    
    }

    
}
 
class oppo extends vivo
        
{

void screen ()
{
    System.out.println("in this phone have a IPS display");
}
        
void refreshRate ()
        
{

    System.out.println("in this phone 128ZGH display");
}


}
class mobile extends oppo
{
void speaker()
{
System.out.println("in this phone 64ZGH display");

}
void mic()
        
{
    System.out.println("samsung");
}      
}
class smartphone extends vivo {
    
   void net () 
   {
            System.out.println("4g 5g");
}
}

public class inharit_chw {
    
    
    public static void main(String[] args) {
        
            oppo op=new oppo();
            op.func();
            System.out.println("---------------------------");
        mobile mob= new mobile();
        mob.refreshRate();
                    System.out.println("---------------------------");
        smartphone sp=new smartphone();
        sp.sim();
    }

}
