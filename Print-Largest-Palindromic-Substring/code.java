import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int size=str.length();size>0;size--){
            for(int i=0;i<=str.length()-size;i++){
                String str1="";
                String str2="";
                for(int j=i;j<i+size;j++){
                    str2=str2+str.charAt(j);
                }
                str1=rev(str2);
                if(str1.equals(str2)){
                    System.out.print(str2);
                    return;
                }
            }
        } 
    }
    public static String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}