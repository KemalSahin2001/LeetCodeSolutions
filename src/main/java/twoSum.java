public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int count = 0;
        for (int i : nums) {
            int countj = 0;
            for (int j : nums) {
                if (i + j == target && count != countj) {
                    int[] arr = {count, countj};
                    return arr;
                }
                countj++;
            }
            count++;
        }
        return new int[]{-1};
    }
}
