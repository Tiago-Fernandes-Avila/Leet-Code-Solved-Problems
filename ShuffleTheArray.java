class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int px = 0;
        int py = n;

        for (int i = 0; i < n * 2; i++){
            if(i % 2 == 0){
                res[i] = nums[px];
                px++;
            }
            else{
                res[i] = nums[py];
                py++;
            }

        }
        return res;
    }
}
