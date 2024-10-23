import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int[] arr1=new int[num1];
        for(int i=0;i<num1;i++){
            arr1[i]=scanner.nextInt();
        }
        int[] arr2=new int[num2];
        for(int i=0;i<num2;i++){
            arr2[i]=scanner.nextInt();
        }
        int[] arr3=new int[arr1.length + arr2.length];
        int index=0;
        for(int i=arr2.length-1;i>=0;i--){
            arr3[index++]=arr2[i];
        }
        for(int k=arr1.length-1;k>=0;k--){
            arr3[index++]=arr1[k];
        }
        for( int a:arr3){
            System.out.print(a+" ");
        }
    }
}