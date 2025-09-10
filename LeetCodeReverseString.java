public class LeetCodeReverseString{
    public static void main(String[] args){
       
    }


    public static void reverseString(char[] s){
        int pont_initial = 0;
        int pont_final = s.length - 1; 

        while(pont_initial < pont_final){
            char right = s[pont_final];
            char left = s[pont_initial];

            s[pont_final] = left;
            s[pont_initial] = right;
            
            pont_final--;
            pont_initial++;

        }
        

        
    }
}