import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelsGameInAString {
    public static void main(){

    }
    public static boolean vowelsGameMethod(String  s){
        Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] caracteres = s.toCharArray();
        boolean bob = true;
        
        boolean alice = false;
        


        while(bob == true && alice == false){
            int subStringPosition = 0; 
            for(int i = 0; i < caracteres.length; i++){
                if (vowelsSet.contains(caracteres[i]) && (subStringPosition + 1) % 2 != 0) {
                    
                                        
                }
            }
        }
    
    return true;
    }

}
