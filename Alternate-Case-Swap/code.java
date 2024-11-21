import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                res=res+(char)(s.charAt(i)+32);
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                res=res+(char)(s.charAt(i)-32);
            }
            else{
                res=res+s.charAt(i);
            }
        }
        System.out.print(res);
    }
}