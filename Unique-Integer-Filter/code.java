import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        for(int a:arr){
            lhs.add(a);
        }
        for(int a:lhs){
            System.out.print(a+" ");
        }
    }
}