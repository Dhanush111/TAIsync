import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.print(input.replaceAll("a","*a"));
        // String str="";
        // for(int i=0;i<input.length();i++){
        //     if(input.charAt(i)=='a'){
        //         str= str+"*"+input.charAt(i);
        //     }
        //     else{
        //         str=str+input.charAt(i);
        //     }
        // }
        // System.out.print(str);
    }
}