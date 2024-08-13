package geeks.array;

class equilibriumPoint1 {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        int n = arr.length;
        if (n == 1) return 1;

        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i + 1;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example array
        long[] arr = {1, 3, 5, 2, 2};

        // Find and print the equilibrium point
        int result = equilibriumPoint(arr);
        if (result != -1) {
            System.out.println("The equilibrium point is at position: " + result);
        } else {
            System.out.println("There is no equilibrium point in the array.");
        }
    }
}
