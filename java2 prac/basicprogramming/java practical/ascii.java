import java.util.Scanner;
public class ascii {

    public static void printAscii(char ch){
        int i = (int)ch;
        System.out.println("The ASCII value of "+ch+" is :"+i);
        }
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("enter a character: ");
            char c =s.next().charAt(0);
            printAscii(c);


    }
}