import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        Set<Character> vowels=new HashSet<>();
        for(char c:"bcdfghjklmnpqrstvwxy".toCharArray()){
            vowels.add(c);
        }
        TreeSet<Character> ts=new TreeSet<>();
        for(Character c:input.toCharArray()){
            if(vowels.contains(c)){
                ts.add(c);
            }
        }
        for(char c:ts){
            System.out.print(c);
        }
        if(ts.isEmpty()){
            System.out.print("-1");
        }
    }
}