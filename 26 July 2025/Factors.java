import java.util.*;
public class Factors{
    public static void Finding_Factors(int n){
        System.out.println("Printing factors!!!");
        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scannerObj.nextInt();

        Finding_Factors(num);
        scannerObj.close();
        
    }
}