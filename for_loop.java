public class for_loop {
    public static void main(String[] args) {
        String[]sweets=new String[5];

        sweets[0]="Gulab Jamun";
        sweets[1]="Jalebi";
        sweets[2]="Laddu";
        sweets[3]="Rasgulla";
        sweets[4]="Halwa";


        System.out.println("Length of arr is:"+sweets.length);
        
        //for loop
        for(int i=0; i<sweets.length;i++){
            System.out.println("The sweets variety are:"+sweets[i]);
        }

    }
}
