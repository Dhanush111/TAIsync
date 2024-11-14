import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n=scanner.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<arr.length;i++){
        arr[i]=scanner.nextInt();
       }
        boolean found=false;
       for(int size=1;size<=arr.length;size++){
        for(int i=0;i<=arr.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
               sum=arr[j]+sum;
               }
               if(isPrime(sum)){
                for(int j=i;j<i+size;j++){
                System.out.print(arr[j]+ " ");
                found=true;
                }
                System.out.println();
               }
        }
       }
       if(!found){
        System.out.print("None");
       }
    }
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}