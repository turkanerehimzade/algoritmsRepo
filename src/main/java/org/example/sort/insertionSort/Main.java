package org.example.sort.insertionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("zehmet olmasa ededleri daxil edin:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int[] array = new int[]{a, b, c, d};
        int n = array.length;
        for(int i=0;i<n;i++){
            int key = array[i];
            int j = i - 1;

            while ( j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for(int k=0;k<n;k++){
            System.out.println(array[k]);
        }
    }
}
