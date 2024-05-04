package org.example.sort.bubbleSort;

import org.example.sort.bubbleSort.Bubble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zehmet olmasa ededleri daxil edin:");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();

        int[] array= new int[]{a,b,c,d};
        int n = array.length;


        Bubble.bubbleSort(array, n);
        printArray(array, n);
    }

    static void printArray(int arr[], int size) {
        for ( int i = 0; i < size; i++)
            System.err.print(arr[i] + " ");
    }
}