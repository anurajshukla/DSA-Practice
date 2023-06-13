class Solution {    
        public List<Integer> countSmaller(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int[] count = new int[max - min + 2];
        Integer[] result = new Integer[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            int index = num - min + 1;

            result[i] = getSum(count, index - 1);
            updateCount(count, index);
        }

        return Arrays.asList(result);
    }

    private int getSum(int[] count, int index) {
        int sum = 0;
        while (index > 0) {
            sum += count[index];
            index -= index & -index;
        }
        return sum;
    }

    private void updateCount(int[] count, int index) {
        while (index < count.length) {
            count[index]++;
            index += index & -index;
        }
    }
}

/*
The countSmaller function takes an input array nums and returns a list of integers representing the counts of smaller elements for each element in nums.

The code starts by finding the minimum and maximum values in the nums array using a loop. This is done to determine the range of values for the count array.

The count array is initialized with a length equal to max - min + 2. The additional two elements are used to avoid index out of bounds errors.

An Integer array result is created to store the counts of smaller elements for each element in nums.

The code then iterates through the nums array in reverse order, starting from the last element. It performs the following steps for each element:

a. Calculates the index for the current element by subtracting the minimum value and adding 1.

b. Retrieves the sum of counts of smaller elements by calling the getSum function with count and index - 1 as arguments. The getSum function uses the binary indexed tree (BIT) or Fenwick tree data structure to efficiently calculate the sum of values up to a given index.

c. Updates the result array with the count of smaller elements.

d. Updates the count array by calling the updateCount function with count and index as arguments. The updateCount function updates the BIT by incrementing the count values for appropriate indices.

Finally, the result array is converted to a list using Arrays.asList and returned as the result.

The key optimizations in the code include using the BIT data structure to efficiently calculate the count of smaller elements and initializing the count array with an appropriate length based on the range of values in the nums array. These optimizations help achieve efficient computation of the counts of smaller elements in O(n log n) time complexity, where n is the number of elements in the nums array.
*/