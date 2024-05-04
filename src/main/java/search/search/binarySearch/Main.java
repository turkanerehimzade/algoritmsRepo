package search.search.binarySearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 40;
        int answer= binarySearch(arr, x);
        if (answer == -1){
            System.out.println(
                    "Element is not present in array");}
        else{
            System.out.println("Element is present at "
                    + "index " + answer);}
    }
    static int binarySearch(int arr[], int x)
    {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x){
                return m;}

            if (arr[m] < x) {
                l = m + 1;
            }
            else{
                r = m - 1;}
        }
        return -1;
    }
}
