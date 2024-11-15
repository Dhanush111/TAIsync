import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean found=false;
     for(int i=0;i<input.length();i++){
        if(input.charAt(i)>=47 && input.charAt(i)<=58){
            System.out.print(input.charAt(i)+" ");
            found=true;
        }
     }
     if(!found){
        System.out.print("No numbers found.");
     }
    }
}