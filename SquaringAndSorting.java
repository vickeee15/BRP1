import java.util.Arrays;

public class SquaringAndSorting {
        public static void sortSquares(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] * arr[i];
            }
            int temp;
            for (int i = 0; i < n; i++){
                for (int j=i+1;j< n;j++){
                    if (arr[i]>arr[j]){
                        temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }

        public static void main(String[] args)
        {
            int array[] = { -4, -1, 0, 3, 10};
            int n = array.length;

            System.out.println("Before sort: ");
            for (int i : array) {
                System.out.print( i +" " );
            }

            sortSquares(array);
            System.out.println("");
            System.out.println("After Sorting: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

