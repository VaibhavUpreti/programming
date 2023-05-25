import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vaibhav Upreti \n");
		System.out.print("Length of array: ");
        int x = sc.nextInt();
        int arr[] = new int[x];
        float sum = 0;
        float avg = 0;
        for(int i=0; i < x ;  i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            sum += arr[i];}
        avg = sum/x;
        System.out.println("Sum of Elements: " + sum);
        System.out.print("Average " + avg);}
}

