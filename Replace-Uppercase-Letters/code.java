import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      String s=scanner.nextLine();
      String res="";
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
      if(Character.isUpperCase(c)){
        res+="#";
      }
      else{
        res+=c;
      }
      }
      System.out.print(res);
    }
}