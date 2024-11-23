import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        TreeSet<String> ts=new TreeSet<>();
        for(int i=0;i<n;i++){
            ts.add(scanner.nextLine());
        }
        for(String s:ts){
            System.out.println(s);
        }
    }
}