import java.util.HashSet;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    hs.add(arr[i]);
                }
            }
        }
        for(int a:hs){
            System.out.print(a+" ");
        }
    }
}