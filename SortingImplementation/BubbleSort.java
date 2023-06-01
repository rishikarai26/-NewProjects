import java.io.*;
public class BubbleSort {
    // Driver program
    public static void main(String... args) {

        int[] a = {64, 34, 25, 12, 22, 11, 90};
        int n = a.length;
        bubbleSort(a, n);
        System.out.println("Sorted array:");
        printArray(a,n);
    }
    //Function to print an array
    static void printArray(int[] a, int size) {
        for(int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
       System.out.println( );
    }
    //Function to implement Bubble Sort
    public static void bubbleSort (int[] a, int n) {
        int i, j, temp;        //we will use swapped as an indicator
        boolean swapped;
        for(i = 0; i < n - 1; i++) {
            swapped = false;
            for(j = 0; j < n-i-1; j++) {
                if (a[j] > a[j + 1]) {

                    // swap a[j] and a[j+1]
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
            }
            // if no two elements were 
            // swapped by inner loop, then break
            if (swapped = true);
                break;
        }

    }

} // it is the first way of implementing bubble sort
