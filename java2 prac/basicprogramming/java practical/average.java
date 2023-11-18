import java.util.Scanner;

public class average {
     public static void main(String[]args) {
    
      Scanner sc=new Scanner(System.in);
        System.out.println("enter five numbers:");
        int num1=sc.nextInt();
          int num2=sc.nextInt();
            int num3=sc.nextInt();
              int num4=sc.nextInt();
                int num5=sc.nextInt();
           double average=(num1+num2+num3+num4+num5)/5;
           System.out.println("the average of five numbers is: "+ average);
     }     
    
}
