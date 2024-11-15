import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       boolean found=false;
      char[] arr=input.toCharArray();
      for(int i=0;i<arr.length;i++){
        if(!(arr[i]>=65 && arr[i]<=90) && !(arr[i]>=97 && arr[i]<=122)
         &&   !(arr[i]>=48 && arr[i]<=57) && (arr[i] !=' ')){
            System.out.print(arr[i]+" ");
            found=true;
        }
      }
      if(!found){
        System.out.print("No special characters found.");
      }
    }
}