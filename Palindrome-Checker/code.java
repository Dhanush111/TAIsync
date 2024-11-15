import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans=isPalindrome(input)?"Yes":"No";
        System.out.print(ans);
    }
    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                    return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}