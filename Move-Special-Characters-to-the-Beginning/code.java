import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder str=new StringBuilder();
        StringBuilder spc=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(!(Character.isLetter(c)|| Character.isWhitespace(c)|| Character.isDigit(c))){
                spc.append(c);
            }
            else
                str.append(c);
        }
        System.out.print(spc.toString() + str.toString());
    }
}