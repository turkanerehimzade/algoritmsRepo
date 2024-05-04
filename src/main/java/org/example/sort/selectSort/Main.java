package org.example.sort.selectSort;

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

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[min]) {
                    min = j;
                    int k = array[min];
                    array[min] = array[i];
                    array[i] = k;
                }}
        }

        for (int z = 0; z < n; ++z) {
            System.out.println(array[z]);
        }
    }
}
