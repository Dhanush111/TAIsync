import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        System.out.println(toIndianCommaNotation(number));
    }
    public static String toIndianCommaNotation(String number) {
        StringBuilder sb=new StringBuilder();
        boolean twodigit=true;
        int gc=0;
        for(int i=number.length()-1;i>=0;i--){
            sb.insert(0,number.charAt(i));
            gc++;
            if((!twodigit && gc==2) ||(twodigit && gc==3)){
                if(i!=0){
                    sb.insert(0,",");
                }
                twodigit=false;
                gc=0;
            }
        }
        return sb.toString();
    }
}