import java.util.*;
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
        for(int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
        }
        int count=0;
        int[] newarr=new int[arr.length+arr2.length];
        for(int i=0;i<arr.length;i++){
            newarr[count++]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            newarr[count++]=arr2[i];
        }
        System.out.print("Merged array: ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        }
    }