import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int si=0;
        int ei=0;
        for(int i=0;i<input.length();i++){
            if(!(input.charAt(i)==' ')){
                si=i;
                break;
            }
        }
        for(int i=input.length()-1;i>=0;i--){
            if(!(input.charAt(i)==' ')){
                ei=i;
                break;
            }
        }
        for(int i=si;i<=ei;i++){
            System.out.print(input.charAt(i));
        }
    }
}