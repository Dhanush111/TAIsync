import java.util.*;
public class Main {
    public static int findSecondLargest(int[] arr) {
    int large=Integer.MIN_VALUE;
    int seclarge=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>large){
            seclarge=large;
            large=arr[i];
        }
        else if(arr[i]>seclarge && arr[i]!=large){
            seclarge=arr[i];
        }       
    }
    return seclarge;     
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print(findSecondLargest(arr));
    }
}