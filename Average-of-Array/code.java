import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       int[] arr=new int[N];
       for(int i=0;i<N;i++){
        arr[i]=sc.nextInt();
       }
       float ans=0;
       float favg=0;
       for(int i=0;i<N;i++){
        favg=arr[i]+favg;
       }
       ans=favg/N;
       System.out.printf("%.2f",ans);
    }
}