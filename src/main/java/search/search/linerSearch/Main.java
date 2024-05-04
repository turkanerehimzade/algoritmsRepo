package search.search.linerSearch;

public class Main {
    public static void main(String[] args) {
        int[] array={23,4,157,22,66,7,8,2};
        int search=22;
        for(int i=0;i< array.length;i++){
            if(search==array[i]){
                System.out.println(i+"ci indeksli element");
            }
            else{
                System.out.println("tapilmadi");
            }
        }

    }
}
