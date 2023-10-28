import java.util.Random;
public class JavaA {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        fisherYatesShuffle(array);
        // Display the shuffled array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    public static void fisherYatesShuffle(int[] array) {
        int n = array.length;
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = random.nextInt(i + 1);
            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
