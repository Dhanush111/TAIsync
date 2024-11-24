import java.util.TreeMap;
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
        Map<Integer,Integer> map=new TreeMap<>();
        for(int a:arr){
            map.put(a,(map.getOrDefault(a,0))+1);
        }
        int max=0;
        int num=0;
        Set<Entry<Integer,Integer>> s=map.entrySet();
        for(Entry<Integer,Integer> e:s){
            if(max<e.getValue()){
                    num=e.getKey();
                    max=e.getValue();   
                    if(num>e.getKey()){
                        num=e.getKey();
                    }
            }
        }
        System.out.print(num);
    }
}