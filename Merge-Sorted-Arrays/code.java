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
        int j=0;
        int k=0;
        while(j<arr1.length && k<arr2.length){
            if(arr1[j]==arr2[k]){
                arr3[index++]=arr1[j];
                arr3[index++]=arr2[k];
                j++;
                k++;
            }
            else if(arr1[j]>arr2[k]){
                arr3[index++]=arr2[k];
                k++;
            }
            else if(arr1[j]<arr2[k]){
                arr3[index++]=arr1[j];
                j++;
            }
        }
        while(j<arr1.length){
            arr3[index++]=arr1[j];
            j++;
        }
        while(k<arr2.length){
            arr3[index++]=arr2[k];
            k++;
        }
        for(int p : arr3){
            System.out.print(p+" ");
        }
     }
}