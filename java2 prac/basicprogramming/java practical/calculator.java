import java.util.Scanner;

public class calculator {
    public static void main(String[]args) {
    
      Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
       int num1=sc.nextInt();
      System.out.print("enter second no:");
       int num2=sc.nextInt();
        
       int sum= num1+num2;
       int difference=num1-num2;
       int product=num1*num2;
       double remainder=num1%num2;
       double quotient=num1/num2;

       System.out.println("sum: "+ sum);
         System.out.println("difference: "+ difference);
           System.out.println("product: "+ product);
             System.out.println("remainder: "+ remainder);
               System.out.println("quotient: "+ quotient);

     
}
}

