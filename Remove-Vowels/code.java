import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'
            || s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U')){
                res=res+s.charAt(i);
            }
        }
        System.out.print(res);
    }
}