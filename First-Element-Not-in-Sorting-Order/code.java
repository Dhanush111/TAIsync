import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int res=-1;
        for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
            res=arr[i+1];
          }
        }
        System.out.print(res);
    }
}