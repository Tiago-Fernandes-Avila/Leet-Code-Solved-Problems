import java.util.*;

//The first approach I took is like using a cannon to kill an ant, but it's a solution anyway, so I'll leave it here.

public class findMaxConsecutiveOnes {
     static void main(){
        int [] nums = {0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0};
        IO.println(badSolutionApproach(nums));
        IO.println(goodSolutionApproach(nums));

    }

    public static int badSolutionApproach(int[] nums){
        boolean isInSequency = false;
        Deque<Integer> sequencies = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1 && !isInSequency){
                sequencies.add(1);
                isInSequency = true;
            } else if (nums[i] == 1 && isInSequency) {
                Integer aux = sequencies.peekLast();
                sequencies.removeLast();
                sequencies.add(aux + 1);
            } else if (nums[i] == 0 && isInSequency){
                isInSequency = false;
            }
        }

        return sequencies.stream().max((x, y) -> x.compareTo(y)).get();
    }

    public static int goodSolutionApproach(int[] nums){
         int max = 0;
         int current = 0;

         for (int num : nums){
             if (num == 1){
                 current++;
                 if (current > max){
                     max = current;
                 }
             }
             else{
                 current = 0;
             }
         }
         return max;
    }
}
