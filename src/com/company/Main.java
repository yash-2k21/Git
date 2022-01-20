package com.company;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] nums = new int[2*n];
        for(int i=0 ; i<arr.length ; i++ )
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<2*arr.length; i++ )
        {
            if(i < arr.length )
            {
                nums[i] = arr[i];
            }
            else
            {
                nums[i] = arr[i-n];
            }
        }
        System.out.println("The Array is - "+ Arrays.toString(arr));
        System.out.println("The Next Array is - "+ Arrays.toString(nums));
    }
}
