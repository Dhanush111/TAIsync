import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String[] url=s.split(",");
        LinkedHashSet<String> ts=new LinkedHashSet<>();
        for(int i=0;i<url.length;i++){
            String[] domain=url[i].split("\\//");
            ts.add(domain[1]);
        }
        for(String itr:ts){
            System.out.println(itr);
        }
    }
}