import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++){
            mul*=i;
        }
        System.out.print(mul);
    }
}