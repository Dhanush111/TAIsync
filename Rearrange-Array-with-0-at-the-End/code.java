import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int i=0,j=0;
        while(j<n){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
        while(i<n){
            arr[i]=0;
            i++;
        }
        for(int a:arr){
            System.out.print(a+ " ");
        }
    }
}