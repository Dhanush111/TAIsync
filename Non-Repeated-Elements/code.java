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
        int i=0,j=0;
        while(i<arr.length && j<arr2.length){
            if(arr[i]==arr2[j]){
                i++;
                j++;
            }
            else if(arr[i]<arr2[j]){
                System.out.print(arr[i]+" " );
                i++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
            if(arr.length<arr2.length){
                while(j<arr2.length){
                    System.out.print(arr2[j++]+" ");
                }
            }
            else{
                while(i<arr.length){
                    System.out.print(arr[i++]+" ");
                }
            }
    }
}