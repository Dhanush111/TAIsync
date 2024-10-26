import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found=false;
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int[] presum=new int[arr.length+1];
        for(int i=1;i<=arr.length;i++){
            presum[i]=presum[i-1]+arr[i-1];
        }
        for(int size=1;size<=arr.length;size++){
        for(int j=0;j<=arr.length-size;j++){
            int sum=presum[j+size]-presum[j];
            if(sum%2==0){
                for(int index=j;index<j+size;index++){
                    System.out.print(arr[index]+" ");
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