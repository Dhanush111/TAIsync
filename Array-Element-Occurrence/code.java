import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
        for(int a:arr){
            lhm.put(a,(lhm.getOrDefault(a,0))+1);
        }
        Set<Entry<Integer,Integer>> sets=lhm.entrySet();
        for(Entry<Integer,Integer> e:sets){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}