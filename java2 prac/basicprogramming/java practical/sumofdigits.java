import java.util.Scanner;

public class sumofdigits {
      public static void main(String[]args) {
    
      Scanner sc=new Scanner(System.in);
        System.out.print("enter an integer  no:");
       int num=sc.nextInt();

       int sum=0;
       int temp=num;

       while(temp != 0){
        int digit=temp%10;
        sum+=digit;
        temp/=10;
    
       }
       System.out.println("the sum of digits are "+num+ " is "+sum);
    }
}
