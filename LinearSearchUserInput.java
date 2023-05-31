import java.util.*;
public class LinearSearchUserInput {
    public static void main(String... args) {

        /* helpful when array is not defined */

        //here it is index idication with letter i,
        //n indicating the size of the array,
        //value indicating the element whose location we are intersted in finding
        //array[] is the array for storage
        int i,n,value,array[];
        

        //use input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = sc.nextInt();

        //allocating memory for n array objects
        array = new int[n];

        System.out.println("Enter those " + n + " elements");
        //traversing the array and asking for the element whose position we are interested in findind
        for(i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter value to find");
        value = sc.nextInt();

        //again traversing and searching for the element
        for(i = 0; i < n; i++) {
            if(array[i] == value) {
                System.out.println(value + " is present at location " + (i+1));
                break;

            } 

        } if(i == n){
            System.out.println(value + "isn't present in array.");
        }

            
            

        
        

    }
}