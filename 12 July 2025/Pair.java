public class Pair {
    public static void PairSum(int[]arr, int targetSum){
        int isPair=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==targetSum){
                System.out.println("Yes!pairs exists!!");
                isPair=1;
                break;
            }
        }
        if(isPair==0){
            System.out.println("No pairs found");
        }
    }
    public static void main(String[] args) {
        int[]arr={10,5,25,8,15};
        PairSum(arr, 5);
    }
        
    }

