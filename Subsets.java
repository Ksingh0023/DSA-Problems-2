class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, int i, List<Integer> curr, List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));

        for (int j = i; j < nums.length; j++) {
            curr.add(nums[j]);
            backtrack(nums, j + 1, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
