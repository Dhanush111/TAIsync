import java.util.Scanner;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] url=s.split(",");
        TreeSet<String> ts=new TreeSet<>();
        for(int i=0;i<url.length;i++){
            String u=url[i];
            String[] domain=u.split("\\.");
                ts.add(domain[1]);
        }
        for(String c:ts){
            System.out.println(c);
        }
    }
}