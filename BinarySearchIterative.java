import java.io.*;
public class BinarySearchIterative {
    public static void main(String... args) {
        int[] a = {10, 20, 30 , 40, 50};
        int value = 30;

        BinarySearchIterative ob = new BinarySearchIterative();
        int result = ob.binarySearch(a, value);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
    // return index of value if it is present in a[];
    public int binarySearch(int[] a, int value) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;

            // Check if value is present at mid 
            if (a[mid] == value ) {
                return mid;

            }
            // if value is greater than mid , ignore left half
            if (a[mid] < value) {
                left = mid + 1;
            }
            // if value is smaller then mid, ignore right half
            if (a[mid] > value) {
                right = mid - 1;
            }
            



        }// if we reach here, than element was not present 
            return -1;
    }
}
