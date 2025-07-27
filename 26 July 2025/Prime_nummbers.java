import java.util.*;

public class Prime_nummbers {
    public static void Prime_Numbers(int n){
        System.out.println("Printing the prime numbers!");
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        for(int i=2;i<n;i++){
            if(n % i==0) //not prime
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("the number is a PRIME Number!");
        } else{
            System.out.println("the number is not a Prime number!");
        }
        
    }
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scannerObj.nextInt();
        Prime_Numbers(num);
        scannerObj.close();
    }
}
