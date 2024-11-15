import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))|| Character.isAlphabetic(s.charAt(i))){
                count++;
            }
        }
        System.out.print(count);
    }
}