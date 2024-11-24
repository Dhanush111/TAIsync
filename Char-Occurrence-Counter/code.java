import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine().toLowerCase();
        char[] arr=s.toCharArray();
        LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<>(); 
        for(int i=0;i<arr.length;i++){
            if(!Character.isWhitespace(arr[i])){
                int c= lhm.getOrDefault(arr[i],0);
                lhm.put(arr[i],c+1);
            }
        }
        Set<Entry<Character,Integer>> res=lhm.entrySet();
        for(Entry<Character,Integer> c:res){
            System.out.println(c.getKey()+":"+c.getValue());
        }
    }
}