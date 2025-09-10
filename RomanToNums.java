import java.util.HashMap;
import java.util.Map;

public class RomanToNums {

   public static int romanToNumsFunction(String s){
    Map<Character, Integer> romanInNums = new HashMap<>();
    romanInNums.put('I', 1);
    romanInNums.put('V', 5);
    romanInNums.put('X', 10);
    romanInNums.put('L', 50);
    romanInNums.put('C', 100);
    romanInNums.put('D', 500);
    romanInNums.put('M', 1000);
    char[]sChar = s.toCharArray();

    int number = 0;

    for(int i = 0; i < s.length(); i++){ //IX -> 9 , 1 - 10 = 9
        Integer characterIdx = romanInNums.get(sChar[i]);
        Integer characterPostIdx = 0;

        if (!(i + 1 == s.length())) {
        characterPostIdx = romanInNums.get(sChar[i + 1]);    
        }
        

        if(characterIdx < characterPostIdx && characterPostIdx != null){
            number +=characterPostIdx -characterIdx; 
            i++;
        }
        else{
            number += characterIdx;
        }

    }
    
return number;

    
   }

   
   public static void main(String[] args) {
   System.out.println("" + romanToNumsFunction("MCMXCIV")); //1000 + 900 + 90 + 4
   }

   
}
