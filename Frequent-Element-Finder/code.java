import java.util.LinkedHashMap;
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
        int num=0;
        int max=0;
        LinkedHashMap<Integer, Integer> hm=new LinkedHashMap<>();
            for(int a:arr){
                hm.put(a,(hm.getOrDefault(a,0))+1);
            }
        Set<Entry<Integer,Integer>> s=hm.entrySet();
        for(Entry<Integer,Integer> e:s){
            if(max<e.getValue()){
                max=e.getValue();
                num=e.getKey();
            }
        }
        System.out.print(num);
    }
}