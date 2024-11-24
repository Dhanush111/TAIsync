import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int a:arr){
            map.put(a,(map.getOrDefault(a,0))+1);
        }
        Set<Entry<Integer,Integer>> s=map.entrySet();
        for(Entry<Integer,Integer> e:s){
            if(e.getValue()==1 && !(isPrime(e.getKey()))){
                System.out.println(e.getKey());
            }
        }    
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}