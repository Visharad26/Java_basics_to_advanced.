
public class multi_dimension {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 8, 9 }, { 4, 5, 6 } };
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j] + " ");
    }
}