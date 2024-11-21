import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder res=new StringBuilder();
        Set<Character> vowels=new HashSet<>();
        for(char c: "aeiouAEIOU".toCharArray()){
            vowels.add(c);
        }
        for(char c:input.toCharArray()){
                if(vowels.contains(c)){
                    res.append("*"+c);
                }else{
                    res.append(c);
                }
        }
        System.out.print(res);
    }
}