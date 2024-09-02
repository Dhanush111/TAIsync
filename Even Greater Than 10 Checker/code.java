import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String res=num>10&&num%2==0?"Even and greater than 10":"Not even or not greater than 10";
        System.out.print(res);
    }
}