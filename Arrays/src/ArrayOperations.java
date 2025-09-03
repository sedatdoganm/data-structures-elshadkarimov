import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
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

        // ********** Istertion an array ************
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insert(0,0);
        //sda.insert(2,20);
        //sda.insert(1,30);
        //sda.insert(12,30);

        sda.print();
    }
}
