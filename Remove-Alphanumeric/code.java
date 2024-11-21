import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
          String in=scanner.nextLine();
          String res="";
          for(int i=0;i<in.length();i++){
               char c=in.charAt(i);
               if(!Character.isLetterOrDigit(c)){
                    res+=c;
               }
          }
          System.out.print(res);
    }
 }