import java.util.Scanner;
public class StdntRegFrm {
    public static void main(String[] args) {
       
        String name , cadd , fathers , mother , dep ,course , brith , padd , email,session;
        long  mobile;
        System.out.println("wellcome to the svvv");
        System.out.println("you can register hare");
        
        Scanner sc =new Scanner (System.in);
        System.out.println("enter your full name");
        name=sc.nextLine();
        System.out.println(" enter your father  Fullname");
        fathers=sc.nextLine();
        System.out.println("enter your mother name");
        mother=sc.nextLine();
        System.out.println("enter your date of brith");
        System.out.println("in this format ");
        System.out.println("DD/MM/YYYY");
        brith=sc.nextLine();
        System.out.println("choose your Department");
        
        String[]deprt={"B.tech","M.tech","msc","bse","bcomm"};
        for (String deprt1 : deprt) {
            System.out.println(deprt1);
        }
        dep=sc.nextLine();
        
        System.out.println("choose your course");
        
        String []crs =new String[5];
      crs[0]="CS";
     crs[1]="ML";
       crs[2]="EEE";
         crs[3]="IT" ;
         crs[4]="IET";
         
            for (int i =0 ; i < crs.length; i++) 
            {
               System.out.println(crs[i]);
            }
            course=sc.nextLine();
            
        System.out.println("enter your session");
        session =sc.nextLine();
            
            
            System.out.println("enter your corrunt full adress with pin code");
            cadd=sc.nextLine();
            
             System.out.println("enter your permanent full adress with pin code");
            padd=sc.nextLine();
            
            System.out.println("enter your mobile numbe");
            mobile=sc.nextLong();
            System.out.println("enter your mail address");
            email=sc.nextLine();
            
            System.out.println("thank you" + name+"for registeretion with us");
            
            System.out.println("name              :-"+name);
            System.out.println("father name       :-"+fathers);
            System.out.println("maother name      :-"+mother);
            System.out.println("date of brith     :-"+brith);
            System.out.println("mobile number     :-"+mobile);
            System.out.println("email id          :-"+email);
            System.out.println("Department        :-"+dep);
            System.out.println("Course            :-"+course);
             System.out.println("session          :-"+session);  
            System.out.println("currunt adreess   :-"+cadd);
            System.out.println("permanent adresss :-"+padd);
           
                    
        }
    
        
        
        
    
    
}
