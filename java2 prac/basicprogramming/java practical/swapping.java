import java.util.Scanner;

public class swapping {
    public static void main(String[]args) {
    
      Scanner sc=new Scanner(System.in);
        System.out.print("enter first no:");
       int num1=sc.nextInt();
      System.out.print("enter second no:");
       int num2=sc.nextInt();
        
       System.out.println("before swapping number 1: "+num1+" number 2: "+num2);
        //swapping
         int temp=num1;
         num1=num2;
         num2=temp;

          System.out.println("after swapping number 1: "+num1+" number 2:"+num2);
        
    }
}
