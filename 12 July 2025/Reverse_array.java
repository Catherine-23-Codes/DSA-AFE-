// To reverse the order of elements in an array

 public class Reverse_array{
    public static void ArrayReverse(int[] arr){

        int[] reversedArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reversedArray[i]=arr[arr.length-1-i];
        }
        System.out.println("Printing the reversed array:");
        for(int i=0;i<arr.length;i++){
            System.out.println((reversedArray[i]));
        }
    }
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        ArrayReverse(arr);
    }
}