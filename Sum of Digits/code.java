import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = findSumOfDigits(num);
        System.out.println(sum);
    }
    public static int findSumOfDigits(int num) {
        int a=0;
        while(num>0){
        int rem=num%10;
        a=rem+a;
        num=num/10;
        }
        return a;
    }
}