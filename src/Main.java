import java.util.*;
class Prime{
    public  boolean isPrime(int num){
        int count=0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count>1){
            return false;
        }
        return true;
    }

    }
public class Main {

    public static void main(String[] args) {
        int result = 0;
        Prime obj = new Prime();
        int prime[] = {12, 41, 4, 6, 7, 13, 18, 21, 29, 17, 37, 55};
        for (int j = 0; j < prime.length; j++) {
            if (obj.isPrime(prime[j])) {
                result += prime[j];
                System.out.println(prime[j] + " : Prime number");
            }
            else System.out.println(prime[j] + " : not prime");
        }
        System.out.println("sum of all prime number in array : "+result);
    }
}
