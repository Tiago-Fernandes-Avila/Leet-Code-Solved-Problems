import java.util.HashMap;
import java.util.Map;

class TwoSumsNoSort {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> mapa = new HashMap<>(); 

        
        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[]{i, mapa.get(complemento)};
            }
            mapa.put(Integer.valueOf(nums[i]), i);
        }


                

        return null;
    } 
}