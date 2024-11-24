import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       LinkedHashMap<Integer,Integer> hmp=new LinkedHashMap<>();
       for(int a:arr){
        hmp.put(a,(hmp.getOrDefault(a,0))+1);
       }
        int max=0;
        int num=0;
       Set<Entry<Integer,Integer>> set=hmp.entrySet();
       for(Entry<Integer,Integer> e:set){
        if(max<=e.getValue()){
            max=e.getValue();
            num=e.getKey();
        }
       }
       System.out.print(num);
    }
}