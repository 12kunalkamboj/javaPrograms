public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 5};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements in array: " + sum);
    }
}
