import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       String res="";
       for(int i=0;i<input.length();i++){
        char c=input.charAt(i);
        if(!Character.isUpperCase(c)){
            res=res+c;
        }
       }
       System.out.print(res);
    }
}