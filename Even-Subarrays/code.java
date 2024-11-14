import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        boolean found=false;
        for(int size=1;size<=n;size++){
            for(int i=0;i<=n-size;i++){
                if(size%2==0){
                for(int j=i;j<i+size;j++){
                    System.out.print(arr[j]+" ");
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
}