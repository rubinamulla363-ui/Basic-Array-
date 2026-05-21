public class CountPalindromes {

    // Function to check palindrome
    public static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int arr[] = {121, 131, 20, 44, 56};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (isPalindrome(arr[i])) {
                count++;
            }
        }

        System.out.println("Number of palindrome elements: " + count);
    }
}