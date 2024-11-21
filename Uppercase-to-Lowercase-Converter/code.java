import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       StringBuilder res=new StringBuilder();
       for(int i=0;i<input.length();i++){
        char c=input.charAt(i);
        if(Character.isUpperCase(c)){
            res.append(Character.toLowerCase(c));
        }
        else{
            res.append(c);
        }
       }
       System.out.print(res.toString());
    }
}