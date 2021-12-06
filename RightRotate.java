import java.lang.reflect.Array;
import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int n =3;
        System.out.println("before rotating arr elements:" + " ");
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i=0; i < n; i++){
            int last= arr[arr.length-1],j;
            for ( j= arr.length-1; j >0; j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        System.out.println("after rotating arr elements:" + " ");
        for (int i : arr) {
            System.out.println(i);
        }
    }}