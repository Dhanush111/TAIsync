import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String res=input.replaceAll("a","*a");
        System.out.print(res.replaceAll("A","*A"));
    }
}