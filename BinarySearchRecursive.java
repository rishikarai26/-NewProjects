import java.io.*;
public class BinarySearchRecursive {
    public static void main(String... args) {
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int a[] = {10, 20 , 30 , 40 , 50};
        int value = 20;
        int left = 0;
        int right = a.length -1;
        int result = ob.binarySearch(a, left, right, value);
        if (result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }

        // returns index of x if it is present in a[left ... right],
        // else return -1
        public int binarySearch(int[] a, int left , int right, int value) {
            //left = 0;
            //right = a.length - 1;
            if (left <= right) {
                int mid = (left + right)/2;

                //if the element is present at the middle itself
                if (a[mid] == value) {
                    return mid;

                }
                //if element is smaller than mid, then it can be only be present in left subarray
                if (a[mid] > value) {
                    return binarySearch(a, left, mid - 1, value);
                } else {
                //else the element can only be present in rigth subarray
                    return binarySearch(a, mid + 1, right, value);
                }

            }
            // if we reach here than that element is not in the array
            return -1;

        }
    
}
