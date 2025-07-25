import java.util.Scanner;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        //1.create an array
        int[] studentMarks=new int[10];

        //2.Take i/p from user
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the marks of the students:");
        for(int i=0;i<studentMarks.length;i++){
            studentMarks[i]=scannerObj.nextInt();
        }

        //3.print avg marks
        int totalMarks=0;
        for(int i=0;i<studentMarks.length;i++){
            totalMarks=totalMarks+studentMarks[i];
        }
        System.out.println("Total Mraks:"+totalMarks);
        int averageMarks=totalMarks/studentMarks.length;
        System.out.println("Average Marks:"+averageMarks);


        //4.Print the lowest marks

    //HW 5. print third lowest mark
    scannerObj.close();
    }
}
