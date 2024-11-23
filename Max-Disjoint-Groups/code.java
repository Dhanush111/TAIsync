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
       Set<Integer> hs=new HashSet<>();
       boolean hasDup=false;
       for(int i=0;i<n;i++){
        if(hs.contains(arr[i])){
           hasDup=true;
        }else{
        hs.add(arr[i]);
        }
        if(hasDup){
            count++;
            hs.clear();
            hasDup=false;
        }
       }  
       System.out.print(count);   
    }
}