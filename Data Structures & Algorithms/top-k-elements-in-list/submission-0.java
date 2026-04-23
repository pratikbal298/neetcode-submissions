class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        for (int x = 0; x < k; x++) {

            int maxCount = 0;
            int element = nums[0];

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == Integer.MIN_VALUE)
                    continue;

                int count = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    element = nums[i];
                }
            }

            result[x] = element;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == element) {
                    nums[i] = Integer.MIN_VALUE;
                }
            }
        }

        return result;
    }
}
