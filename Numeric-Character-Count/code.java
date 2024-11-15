import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num=scanner.nextLine();
        int count=0;
        for(int i=0;i<num.length();i++){
            if(Character.isDigit(num.charAt(i))){
                count++;
            }
        }
        System.out.print(count);
    }
}