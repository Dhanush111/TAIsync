import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int[] arr2=new int[m];
        for(int j=0;j<m;j++){
            arr2[j]=scanner.nextInt();
        }
       ArrayList<Integer> al=new ArrayList<>();
       int i=0,j=0;
       while(i<n && j<m){
        if(arr[i]%2!=0 && arr2[j]%2!=0){
            if(arr[i]==arr2[j]){
                al.add(arr[i]);
                i++;
                j++;
            }
            else if(arr[i]<arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        else{
            if(arr[i]%2==0){
                i++;
            }
            if(arr2[j]%2==0){
                j++;
            }
        }
       }
       if(al.isEmpty()){
        System.out.print("No common odd elements found.");
       }
       else{
      for(int num:al){
        System.out.print(num+" ");
      }
      }
    }
}
//test