import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner dhon = new Scanner(System.in);
        int a;
        a = dhon.nextInt();
        
        int b;
    
        b=dhon.nextInt();
       



      


    System.out.println("1.Add  2.Sub  3.Multilication  4.Divide");
    int c;           
    c=dhon.nextInt();  
    

    
    
    if(c==1){
        
        
    System.out.println(a+b);


    }
    else if(c==2){

        System.out.println(a-b);

    }
    else if(c==3){
        System.out.println(a*b);

    }

    else if(c==4){
        System.err.println(a/b);
    }
 
  } 


}