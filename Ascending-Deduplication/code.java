import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Collections;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        TreeSet<Integer> lhs=new TreeSet<>();
        for(int i=0;i<n;i++){
            lhs.add(scan.nextInt());
        }
        for(int a:lhs){
            System.out.print(a+" ");
        }
    }
}