import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       Set vowels=new HashSet();
       for(char c:"aeiouAEIOU1234567890. ".toCharArray()){
        vowels.add(c);
       }
        StringBuilder res=new StringBuilder();
       for(char c: input.toCharArray()){
            if(vowels.contains(c)){
                    res.append(c);
            }
       }
       System.out.print(res);
    }
}