import java.util.Scanner;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in=scanner.nextLine();
        TreeSet<String> ts=new TreeSet<>();
        String[] arr=in.split(",");
        for(String s:arr){
            ts.add(s);
        }
        for(String s:ts){
            System.out.println(s);
        }
    }
}