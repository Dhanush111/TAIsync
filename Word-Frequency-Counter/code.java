import java.util.*;
import java.util.Map.Entry;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] arr=s.split(" ");
        TreeMap<String, Integer> hm=new TreeMap<>();
            for(int i=0;i<arr.length;i++){
              int c=  hm.getOrDefault(arr[i],0);
                hm.put(arr[i],c+1);
            }
            Set<Entry<String,Integer>> res=hm.entrySet();
            for(Entry<String,Integer> a:res){
                System.out.println(a.getKey()+":"+a.getValue());
            }
    }
}