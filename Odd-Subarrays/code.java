import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        for(int size=1;size<=arr.length;size++){
        for(int i=0;i<=arr.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
                sum=sum+arr[j];
            }
            if(size%2!=0){
                for(int j=i;j<i+size;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
    }
}