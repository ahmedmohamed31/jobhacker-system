class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 4};
        int[] indices = twoSum(array, 7);
        if (indices != null) {
            for (int i = 0; i < indices.length; i++) {
                System.out.println(indices[i]);
            }
        }
    }
}
