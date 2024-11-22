import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
       for(int i=0;i<=str.length()-4;i++){
        // String str2=str.substring(i,i+4);
        if(isPalindrome(str.substring(i,i+4))){
            System.out.println(str.substring(i,i+4));
        }
       }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
                i++;
                j--;           
        }
        return true;
    }
}