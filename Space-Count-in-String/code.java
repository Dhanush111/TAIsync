import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
      String [] arr=input.split(" ");
      System.out.print(arr.length-1);
    }
}