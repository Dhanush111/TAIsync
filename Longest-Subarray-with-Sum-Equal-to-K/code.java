import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k=scanner.nextInt();
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        boolean found=false;
        for(int size=n;size>=1;size--){
            for(int i=0;i<=n-size;i++){
                int sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+arr[j];
                }
                if(sum==k){
                    for(int j=i;j<i+size;j++){
                        System.out.print(arr[j]+" ");
                        found=true;                 
                    }
                    return;
                }
            }
        }
        if(!found){
            System.out.print("No subarray found.");
        }
    }
}