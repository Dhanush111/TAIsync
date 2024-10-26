import java.util.Scanner;
public class Main {
    static void subarrayOfSize(int[]arr, int k) {
        int[] prefixSum=new int[arr.length+1];
        //creating prefix sum array
        for(int i=1;i<=arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i-1];
        }
        //calculating sum for each and every size
        for(int size=1;size<arr.length;size++){
        for(int i=0;i<=arr.length-size;i++){
            int sum=prefixSum[i+size]-prefixSum[i];
            if(sum==k){
                for(int j=i;j<i+size;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        subarrayOfSize(arr,k);
    }
}