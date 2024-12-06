import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(isArmstrong(N) ? "Armstrong" : "Not Armstrong");
    }
    public static boolean isArmstrong(int N) {
      String s=Integer.toString(N);
      int power=s.length();
      int sum=0;
      int num=N;
      while(num!=0){
        int temp=num%10;
        sum+=Math.pow(temp,power);
        num/=10;
      }
      return N==sum;
    }
}