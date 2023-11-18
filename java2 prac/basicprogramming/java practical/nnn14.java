import java.util.Scanner;

public class nnn14 {
    public static void integerNumber(int n){
        int nn=n*11;
        int nnn=n*111;
        int result=n+nn+nnn;
        System.out.println("The value of n + nn + nnn is:  "+result);
        }
        public static void main (String[] args){
            
            Scanner s=new Scanner(System.in);
            System.out.println("enter an integer(n): ");
            int n =s.nextInt();
            integerNumber(n);
            }
        }


