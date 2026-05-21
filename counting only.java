public class TransitionPoint {

    public static int findTransitionPoint(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                return i;   // Transition point
            }
        }

        return -1; // If no 1 is found
    }

    public static void main(String[] args) {

        int arr[] = {0, 0, 0, 1, 1, 1};

        int result = findTransitionPoint(arr);

        System.out.println("Transition Point Index: " + result);
    }
}