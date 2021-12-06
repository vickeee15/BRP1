public class leftRotate {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int n =3;
        System.out.println("before rotating arr elements:" + " ");
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i=0; i < n; i++){
            int first=arr[0],j;
            for ( j=0; j < arr.length-1; j++){
                arr[j]=arr[j+1];
            }
             arr[j]=first;
        }
        System.out.println("after rotating arr elements:" + " ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
