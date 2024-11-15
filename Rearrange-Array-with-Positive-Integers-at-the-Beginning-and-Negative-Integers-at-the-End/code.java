import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        ArrayList<Integer> pos=new ArrayList();
        ArrayList<Integer> neg=new ArrayList();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        for(int a:pos){
        System.out.print(a+ " ");
        }
        for(int b:neg){
            System.out.print(b+" ");
        }
    }
}