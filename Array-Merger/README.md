
# Array Merger

Problem





Given two sorted array of integers, merge these two arrays and print it as the output.





Input Format



First line contains an integer n representing the size of the array The Second line consists of a single line containing space-separated integers. Third line contains an integer n representing the size of the array The Fourth line consists of a single line containing space-separated integers.





Output Format



Print the merged array.





Sample Inputs & Outputs



Sample Input 1

3

1 2 3

4

4 5 6 7



Sample Output 1

Merged array: 1 2 3 4 5 6 7







Sample Input 2

4

1 2 3 4

5

3 4 5 6 7



Sample Output 2

Merged array: 1 2 3 4 3 4 5 6 7







Constraints



1 <= N <= 10^5 -10^5 <= arr[i] <= 10^5 N is always odd.







import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=scanner.nextInt();
        }
        int count=0;
        int[] newarr=new int[arr.length+arr2.length];
        for(int i=0;i<arr.length;i++){
            newarr[count++]=arr[i];
        }
        for(int i=0;i<arr2.length;i++){
            newarr[count++]=arr2[i];
        }
        System.out.print("Merged array: ");
        for(int i=0;i<newarr.length;i++){
            System.out.print(newarr[i]+" ");
        }
        }
    }