import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String ans=(n>=97&&n<=122)?"Yes":"No";
        System.out.print(ans);
    }
}