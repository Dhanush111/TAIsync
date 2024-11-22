import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
       int i=0;
       int j=0;
       while(i<str1.length() && j<str2.length()){
        if(str1.charAt(i)==str2.charAt(j)){
            i++;
            j++;
        }
        else{
            i++;
        }
       }
       String ans=(j==str2.length())?"Yes":"No";
       System.out.print(ans);
    }
}