import java.util.Scanner;

public class secondsToHour19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        int sec =s.nextInt();
        int hrs,min;
        min=(sec/60);
        sec=sec%60;
        hrs=(min/60);
        min=min%60;
        System.out.println(sec + "seconds are equal to: " + hrs + " hours " + min+ "  minutes ");
        }
        
    
}
