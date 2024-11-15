import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int vowels=0,sc=0,cons=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowels++;
            }
            else if(Character.isLetter(ch)){
                cons++;
            }
            else if(!Character.isLetter(ch) && !Character.isDigit(ch) ){
                sc++;
            }
        }
        System.out.println("Vowels: "+vowels );
        System.out.println("Consonants: "+ cons);
        System.out.println("Special Characters: "+sc);
    }
}