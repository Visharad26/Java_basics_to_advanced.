package array;

public class max_in_array {
    static int largest (int []arr ){
    int i;

    int max = arr[0];
    for (i = 1; i < arr.length; i++)
        if (arr[i] > max )
            max = arr[i];
    return max;
    }
public static void main (String [] args){
    int arr[]= {10, 20, 324, 9808, 90};
    System.out.println("Largest in given array is " + largest(arr));
}
}

