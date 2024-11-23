import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        TreeSet<Character> ts=new TreeSet<>();
        for(char c:s.toCharArray()){
            ts.add(c);
        }
        for(char c:ts){
            System.out.print(c+" ");
        }
        // ArrayList<Character> al=new ArrayList<>();
        // LinkedHashSet<Character> lhs=new LinkedHashSet<>();
        // for(char a:s.toCharArray()){
        //     lhs.add(a);
        // }
        // for(char a:lhs){
        //     al.add(a);
        // }
        // Collections.sort(al);
        // for(char a:al){
        //     System.out.print(a+" ");
        // }
    }
}