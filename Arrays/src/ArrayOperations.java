import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(7);
        /*
        // ************Create an array*************

        int[] arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr));

        // Su sekilde de bir kontrol de yapabiliriz.

        int []arr2 = new int[5];
        arr2[0] = 5;
        arr2[1] = 8;
        System.out.println(Arrays.toString(arr2));
        // output: [5, 8, 0, 0, 0] // Buradan da gordugumuz gibi int bir dizi'deki manuel degerler 0'dir.
        */

        /*
        // ********** Istertion an array ************
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insert(0,0);
        //sda.insert(2,20);
        //sda.insert(1,30);
        //sda.insert(12,30);
        sda.print();
         */

        /*
        // ********** Accessing array element ************ Time Complexity: O(1)
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.arr[0] = 15;
        var firstElement = sda.arr[0];
        System.out.println(firstElement);

        System.out.println(Arrays.toString(sda.arr)); // Bu satirdaki gibi de diziyi yazdirabiliriz.
        */

        /*
        // ************* Array traversal ************
        sda.insert(0,0);
        sda.insert(1,10);
        sda.insert(2,20);
        sda.insert(1,30);
        sda.insert(12,120);
        System.out.println("Array traversal");
        sda.traverseArray();
        */

        // ************* Search for array element ************

        sda.insert(1,5);
        sda.searchInArray(5);


    }
}
