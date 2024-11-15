import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n=scanner.nextInt();
        if(n+1>input.length()){
            System.out.print("Invalid index");
        }else
        System.out.print(input.charAt(n));
    }
}