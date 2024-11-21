import java.util.Scanner;
import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        LinkedHashSet<Character> hs=new LinkedHashSet<>();
        for(char a:s.toCharArray()){
            hs.add(a);
        } 
        for(char i:hs){
            System.out.print(i);
        }
    }
}