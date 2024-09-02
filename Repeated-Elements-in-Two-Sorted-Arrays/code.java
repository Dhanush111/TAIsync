while(i<n && j<m){
            if(arr[i]==arr2[j]){
        List<Integer> al=new ArrayList<>();
        int i=0,j=0;
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
import java.util.List;
import java.util.Scanner;
public class Main {
import java.util.ArrayList;
            if(arr[i]==arr2[j]){
                al.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
       for(int num:al){
        System.out.print(num+" ");
       }
    }
}