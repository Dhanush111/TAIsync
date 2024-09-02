import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
        }
        repEle(arr,arr2);
    }
    static void repEle(int[] arr, int[] arr2){
        // List<Integer> al=new ArrayList<>();
        int i=arr.length-1,j=0;
        while(i>=0 && j<arr2.length){
            if(arr[i]==arr2[j]){
                System.out.print(arr2[j]+" ");
                i--;
                j++;
            }else if(arr[i]<arr2[j]){
                i--;
            }else{
                j++;
            }
    }
        // for(int a:al){
        //     System.out.print(a+" ");
        // }
}
}