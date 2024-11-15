import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int i=arr.length-1;
        int j=arr.length-1;
        while(j>=0){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i--;
            }
            j--;
        }
        while(i>=0){
            arr[i]=0;
            i--;
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}