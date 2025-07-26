import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        String[]sweets=new String[6];

        Scanner sc=new Scanner(System.in);

        sweets[0]=sc.nextLine();
        sweets[1]=sc.nextLine();
        sweets[2]=sc.nextLine();
        sweets[3]=sc.nextLine();
        sweets[4]=sc.nextLine();
        sweets[5]=sc.nextLine();

      
        for(int i=0;i<sweets.length;i++){
            System.out.println("Sweets are:"+sweets[i]);
        }


    }
}
