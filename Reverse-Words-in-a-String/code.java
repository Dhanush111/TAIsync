import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arr=string.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(reverse(arr[i])+" ");
        }
    }
    static String reverse(String s){
        int i=0;
        int j=s.length()-1;
        String ans="";
        char[] arr=s.toCharArray();
        while(i<j){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
        }  
        for(char a: arr){
            ans+=a;
        }
        return ans;
    }
}