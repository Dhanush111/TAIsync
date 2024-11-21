import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
       StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)) || Character.isWhitespace(s.charAt(i))){
                res.append(s.charAt(i));
            }
        }
        System.out.print(res.toString());
    }
}