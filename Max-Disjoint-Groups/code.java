import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n=scanner.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=scanner.nextInt();
       }
       int count=0;
       boolean dup=false;
       Set<Integer> hs=new HashSet<>();
       for(int i=0;i<n;i++){
        if(hs.contains(arr[i])){
            count++;
            hs.clear();
            dup=false;
        }
        hs.add(arr[i]);
        dup=true;
       }
       if(!dup){
       System.out.print(count);
       }
       System.out.print(count);
    }
}