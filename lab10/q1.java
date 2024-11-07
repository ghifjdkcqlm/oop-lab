public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        swap(nums, 1, 3); // Swaps elements at index 1 and 3
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}
