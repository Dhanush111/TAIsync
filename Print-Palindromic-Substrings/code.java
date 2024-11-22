import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int size=1;size<=str.length();size++){
            for(int i=0;i<=str.length()-size;i++){
                String pal=str.substring(i,i+size);
                if(isPalindrome(pal)){
                    System.out.println(pal);
                }
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}