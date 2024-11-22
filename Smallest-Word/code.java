import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] arr= s.split(" +");
        String ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(ans.length()>arr[i].length()){
                ans=arr[i];
            }
        }
        System.out.print(ans);
    }
}