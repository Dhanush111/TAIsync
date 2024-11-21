import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuilder res=new StringBuilder();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!Character.isDigit(c)){
                res.append(c);
            }
            else{
               sum=sum+c-48;
            }
        }
        System.out.print(res.toString()+sum);
    }
}