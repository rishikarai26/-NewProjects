/*class LinearSearch {
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.nextLine());
    int[] b = int[10];
    for (int i = 0; i < 10; i++) {
      b[i] = Integer.parseInt(scanner.nextLine())
    }
    System.out.println("The value is at index: " + linearSearch(b, a));

  }
  public static int linearSearch(int[] b, int a) {

  }
}*/

import java.io.*;
class LinearSearch {
    public static void main(String... args) {
    int[] a = {10, 14, 19, 26, 27, 31, 33, 35, 42, 44};
    int value = 50;
    System.out.println(value + " is found at index:" + linearSearch(a, value));
    }

    public static int linearSearch(int[] a, int value) {
      // traverse the array
      for(int i = 0; i < a.length; i++) {
          //match the value with the array element 
          if(a[i] == value){
              //returing index position of the element
              return i;
          }
      } // when element not found
      return -1;
    }
    System.out



    
}