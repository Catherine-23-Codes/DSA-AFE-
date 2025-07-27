import java.util.*;
public class Factorials{
    public static void PrintFactorial(int n){
        int factorial=1;
        if(n<0){
            System.out.println("Factorial is not defined for negative number!");
        }
        if(n==0){
            factorial=1;
        }else{
            for(int i=1;i<=n;i++){
                factorial=factorial*i;
            }
        }
        System.out.println("the factorial is:"+factorial);
    }
    public static void main(String args[]){
        PrintFactorial(3);
    }
}

