public class Main
{
    public static void main(String[] args) {
        int[] arrOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 42};
        int[] arrNotOrder = {2, 1, 3, 4, 5, 6, 7, 8, 9, 42};

        // Check if array 1 is ordered or not.
        boolean ordered = true;

        // Loop through array, checking for out
        // of order elements
        for (int i = 0; i < arrOrder.length - 1; i++) {
            if (arrOrder[i] > arrOrder[i + 1]) {
                ordered = false;
            }
        }
        if (ordered) {
            System.out.println("The array is in order.");
        } else {
            System.out.println("The array is NOT in order.");
        }
        System.out.println("Expected: The array is in order.");


        // Check if array 2 is ordered or not.
        ordered = true;

        // Loop through array, checking for out
        // of order elements
        for (int i = 0; i < arrNotOrder.length - 1; i++) {
            if (arrNotOrder[i] > arrNotOrder[i + 1]) {
                ordered = false;
            }
        }
        if (ordered) {
            System.out.println("The array is in order.");
        } else {
            System.out.println("The array is NOT in order.");
        }
        System.out.println("Expected: The array is NOT in order.");
    }
}
