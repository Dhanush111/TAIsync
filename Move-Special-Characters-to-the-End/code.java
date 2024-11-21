import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder str=new StringBuilder();
        StringBuilder spc=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(Character.isLetterOrDigit(c)|| Character.isWhitespace(c)){
                str.append(c);
            }else{
                spc.append(c);
            }
        }
            System.out.print(str.toString() + spc.toString());
        }
    }