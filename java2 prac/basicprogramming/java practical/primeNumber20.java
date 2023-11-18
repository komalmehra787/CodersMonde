//sum of 100 prime numbers without any inbuilt function


public class primeNumber20 {
    public static void main(String[] args) {
        int sum = 0;
        int count=0;
        int num=2;
        while (count<100){
            if (isPrime(num)){
                sum+=num;
                count++;
                }
                num++;
                }
                System.out.println("Sum of prime number is: "+sum);
                }
                public static boolean isPrime(int number){
                    for(int i=2;i<=number/2;i++){
                        if(number%i==0){
                            return false;
                            }
                            }
                            return true;
                            }
                            }
                
       

    

