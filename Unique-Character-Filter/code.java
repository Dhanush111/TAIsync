import java.util.LinkedHashSet;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        LinkedHashSet<Character> ucf=new LinkedHashSet<>();
        for(char c:s.toCharArray()){
            ucf.add(c);
        }
        for(char s2:ucf){
            System.out.print(s2);
        }
    }
}