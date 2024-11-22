import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String str2=scanner.nextLine();
        int count=0;
        for(int i=0;i<=str.length()-str2.length();i++){
            String strfreq=str.substring(i,i+str2.length());
            if(strfreq.equals(str2)){
                count++;
            }
        }
        System.out.print(count);
    }
}