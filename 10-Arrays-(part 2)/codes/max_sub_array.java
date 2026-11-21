
public class max_sub_array {

    public static void maxSubarraySum(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++) {

            int start = i;

            for(int j = i; j < numbers.length; j++) {

                int end = j;
                int currentSum = 0;

                for(int k = start; k <= end; k++) {

                    currentSum += numbers[k];

                }

                System.out.println(currentSum);

                if(maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10};

        maxSubarraySum(numbers);
    }
}
