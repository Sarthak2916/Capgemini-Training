package feature_29_1_26;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SearchTarget {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        int target= input.nextInt();

        //linear search
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println("Target is found at index: "+i);
                break;
            }
        }

        //binary search
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==target){
                System.out.println("Target is found at index: "+mid);
                break;
            }
            else if(arr[mid]>target) e=mid-1;
            else s=mid+1;
        }
    }
}
