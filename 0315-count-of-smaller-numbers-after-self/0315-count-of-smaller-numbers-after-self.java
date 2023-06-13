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