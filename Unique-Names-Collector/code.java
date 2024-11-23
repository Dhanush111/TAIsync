import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
       LinkedHashSet<String> lhs=new LinkedHashSet<>();
       for(int i=1;i<=n;i++){
        lhs.add(scanner.nextLine());
       }
       for(String s:lhs ){
        System.out.println(s);
       }
    }
}