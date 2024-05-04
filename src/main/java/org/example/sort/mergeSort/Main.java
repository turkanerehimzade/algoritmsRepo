package org.example.sort.mergeSort;

public class Main {
    public static void main(String[] args) {
int array[]={332,5,21,856,4,2,88,97,11};
bol(array,0, array.length-1);

    }

    public static void birleshdir(int array[], int left, int center, int right) {
        int list1 = center - left + 1;
        int list2 = right - center;
        int Left[] = new int[list1];
        int Right[] = new int[list2];
        for (int i = 0; i < list1; i++) {
            Left[i] = array[left + i];
        }
        for (int j= 0; j < list2; j++) {
            Right[j] = array[center+1+j];

        }
        int i = 0, j = 0;
        int k = left;
        while (i < list1 && j < list2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            }
            else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < list1) {
            array[k] = Left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < list2) {
            array[k] = Right[j];
            j++;
            k++;
        }
        for(int w=0;w< array.length;w++){
            System.out.println(array[w]);
        }
    }

    public static void bol(int array[], int left, int right) {
        if (left < right) {
            int center = left + (right - 1) / 2;
            bol(array, left, center);
            bol(array, center + 1, right);
            birleshdir(array, left, center, right);
        }
        else{
            System.out.println("aaa");
    }
}}
