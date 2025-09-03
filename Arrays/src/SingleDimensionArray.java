import javax.crypto.spec.PSource;
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

    // Array traversal
    public void traverseArray(){ // Time complexity: O(n)
        try{
            for(int i = 0;i< arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
        }catch (Exception e){
            System.out.println("Array no longer exists!");
        }
    }

    // Search for an element int the given Array
    public void searchInArray(int valueToSearh){ // Time complexity: O(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i] == valueToSearh){
                System.out.println("The value is found.");
                return;
            }
        }
        System.out.println("The value is not found!");
    }

    // Delete an array element
    public void delete(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully.");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index that is provided is not in the range of array!");
        }
    }

    public void print(){
        System.out.print("Element of the array: ");
        for(int a: arr){
            System.out.print(+a+ " ");
        }

    }
}



