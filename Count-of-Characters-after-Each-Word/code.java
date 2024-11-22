import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr=input.split(" ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+arr[i].length()+" ");
        } 
    }
}