import java.util.Arrays;

public class SingleDimensionArray {
    int []arr = null;
    int size;
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        // Arrays.fill(arr, Integer.MIN_VALUE); --> Bu sekilde de tum diziyi min integer degeriyle doldurabiliriz.
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
        size = 0;
    }

    public void insert(int location, int valueToBeInserted){ // Time complexity: O(1)
    // location == index
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Succesfully inserted.");
            }
            else{
                System.out.println("This cell is already occupied.");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }



    public void print(){
        System.out.print("Element of the array: ");
        for(int a: arr){
            System.out.print(+a+ " ");
        }

    }
}



