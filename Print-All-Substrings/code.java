import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int size =1;size<=str.length();size++){
            for(int i=0;i<=str.length()-size;i++){
                for(int j=i;j<i+size;j++){
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }
        }
    }
}