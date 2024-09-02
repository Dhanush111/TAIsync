import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int  count=1;
    for(int i=1;i<=100;i++){
      if(i%3==0||i%5==0||i%7==0){
        System.out.print(i+" ");
        count++;
        if(count>n){
          break;
        }
    }
  }
  }
}