import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder res=new StringBuilder();
       for(int i=0;i<input.length();i++){
        if(!(Character.isLowerCase(input.charAt(i)))){
            res.append(input.charAt(i));
        }
       }
       System.out.print(res.toString());
    }
}