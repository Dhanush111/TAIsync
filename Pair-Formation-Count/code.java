import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> hm=new HashMap<>();
        for(int a:arr){
            hm.put(a,(hm.getOrDefault(a,0)+1));
        } 
        int count=0;
        for(int a:hm.values()){
            count+=a/2;
        }
        System.out.print(count);
    }
}