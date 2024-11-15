import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean found=false;
        char[] ch=input.toCharArray();
        for(int a:ch){
            if((a>=65 && a<=90) || (a>=97 && a<=122)){
            System.out.print((char)a+" ");
            found=true;
            }
        }
        if(!found){
            System.out.print("No valid characters found.");
        }
    }
}