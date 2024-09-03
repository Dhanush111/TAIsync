import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pos=0;
        int neg=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){   
            if(arr[i]>0){
                pos=arr[i]+pos;
            }
            else{
                neg=arr[i]+neg;
            }
        }
        System.out.println(pos);
        System.out.println(neg);
    }
}