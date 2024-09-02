import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for(int i=1;i<=n;i++){
      if(2*i<=n){
        System.out.print(2*i+" ");
      }
    }
  }
}