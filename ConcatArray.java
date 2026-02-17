public class ConcatArray {

        public int[] getConcatenation(int[] nums) {
            int[] ans = new int[nums.length * 2];
            int ite = 0;
            for (int i = 0; i < ans.length; i++){
                ite = ite % nums.length;
                ans[i] = nums[ite];
                ite++;
            }

            return ans;
        }

}
