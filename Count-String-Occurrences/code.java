import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int count=0;
       for(int i=0;i<=str1.length()-str2.length();i++){
        if(str1.substring(i,i+str2.length()).equals(str2)){
            count++;
        }
        }
       System.out.print(count);
    }
    }