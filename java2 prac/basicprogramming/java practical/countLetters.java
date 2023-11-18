import java.util.Scanner;

public class countLetters{
    public static void countCharacters(String input){
        int letterCount= 0;
        int spaceCount=0;
        int numberCount=0;
        int otherChar=0;
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch>='A' && ch<='Z')) {
                letterCount++;
                } else if (ch == ' ') {
                    spaceCount++;
            
                    }else if((ch>= '0' && ch<= '9')){
                        numberCount++;
                        }else{
                            otherChar++;
                            }
                            }
                           
                            System.out.println("Number of letters: " +letterCount);
                            System.out.println("Number of spaces: "+spaceCount);
                            System.out.println("Number of numbers: "+numberCount);
                            System.out.println("Other characters: "+otherChar);
                            }
                            

    public static void main(String[]args){
                        Scanner s= new Scanner(System.in);
                        System.out.println("enter the string: ");
                        String str=s.nextLine();
                        countCharacters(str);
                        }}



    