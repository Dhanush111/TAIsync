import java.util.Scanner;
public class Main {
static int firstOccurance(int[] arr,int k){  
   int start=0,end=arr.length-1,res=-1;
   while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==k){
         res=mid;
         end=mid-1;
      }
      else if(arr[mid]<k){
            start=mid+1;
      }
      else{
         end=mid-1;
      }
   }
   return res;
}
static int lastOccur(int[] arr,int k){
   int start=0,end=arr.length-1,res=-1;
   while(start<=end){
      int mid=start+(end-start)/2;
      if(arr[mid]==k){
         res=mid;
         start=mid+1;
      }else if(arr[mid]<k){
         start=mid+1;
      }
      else{
         end=mid-1;
      }
   }
   return res;
}
static int countOccur(int[] arr, int k){
   int firstocc=firstOccurance(arr,k);
   if(firstocc==-1){
      return 0;
   }
   int lastocc=lastOccur(arr,k);
   return lastocc-firstocc+1;
}
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
   int[] arr=new int[N];
   for(int i=0;i<N;i++){
      arr[i]=scanner.nextInt();
   }
   int k=scanner.nextInt();
   System.out.print(countOccur(arr,k));
 }
}