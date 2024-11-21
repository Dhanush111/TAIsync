import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder chars=new StringBuilder();
        StringBuilder nums=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(!Character.isDigit(c)){
                chars.append(c);
            }
            else if(!Character.isLetter(c)){
                nums.append(c);
            }
        }
        System.out.print(chars.toString() + nums.toString());
    }
}