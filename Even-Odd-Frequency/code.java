import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;
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
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int a:arr){
            map.put(a,(map.getOrDefault(a,0))+1);
        }
        boolean found=false;
        Set<Entry<Integer,Integer>> s=map.entrySet();
        for(Entry<Integer,Integer> e:s){
            if((e.getKey()%2==0 && e.getValue()%2!=0) || (e.getKey()%2!=0 && e.getValue()%2==0)){
                found=true;
                System.out.println(e.getKey());
            }
        }
        if(!found){
            System.out.print("No Repeating Elements");
        }
    }
}