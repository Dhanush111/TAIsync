import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashSet<Character> hs=new HashSet<>();
        for(Character c:"aeiouAEIOU".toCharArray()){
            hs.add(c);
        }
        int count=0;
        for(int i=0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i)) && !(hs.contains(input.charAt(i)))){
                    count++;
            }
        }
        System.out.print(count);
    }
}