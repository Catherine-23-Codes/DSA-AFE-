import java.util.Scanner;

class marks{
    public static void main (String args[]){

    /* 1. create an array that stores marks of 10 students */
    int[] StudentMarks=new int[10];

    /* 2. get input from user and store marks in array */
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("enter marks of 10 students:");
        for(int i=0;i<StudentMarks.length;i++){
            StudentMarks[i]=scannerObj.nextInt(); 
            // nextInt()-used to read int value provided by user
        }
    /*3.print avg marks */

    //avg marks=sum of all marks / total 
    int totalMarks=0;
    for(int i=0;i<StudentMarks.length;i++){
        totalMarks=totalMarks+ StudentMarks[i];
    }
    System.out.println("Total Marks:"+totalMarks);

    double averageMarks=totalMarks/(double)StudentMarks.length;
    System.out.println("average marks is:"+averageMarks);

 //4.Print the lowest marks
 int lowestMarks=StudentMarks[0];
 for(int i=0;i<StudentMarks.length;i++){
    if(lowestMarks>StudentMarks[i]){
        lowestMarks=StudentMarks[i];
    }
 }
 System.out.println("the lowest marks is:"+lowestMarks);


 //5.Print highest marks
 int highestMarks=StudentMarks[0];
 for(int i=0;i<StudentMarks.length;i++){
    if(highestMarks<StudentMarks[i]){
        highestMarks=StudentMarks[i];
    }
 }
System.out.println("The highest marks is:"+highestMarks);



    }
}
