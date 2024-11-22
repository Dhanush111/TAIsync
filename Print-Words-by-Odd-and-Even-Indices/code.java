import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr=input.split(" ");
        int i=0;
        int j=1;
        while(i<arr.length || j<arr.length){
            System.out.print(arr[j]+" ");
            System.out.print(arr[i]+" ");
            i=i+2;
            j=j+2;
        }
    }
}