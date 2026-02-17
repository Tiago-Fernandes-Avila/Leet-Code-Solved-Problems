public class ReverseBitsWithStrings {
    private static final int bits = Integer.BYTES * 8;

    public static void main(String [] args){

        int num = 4;

        String bitsOfTheNum = Integer.toBinaryString(num);

        bitsOfTheNum = String.format("%32s",bitsOfTheNum).replaceAll(" ", "0");

        IO.println(bitsOfTheNum);

        char [] reversedbits = new char[bitsOfTheNum.length()];

        for (int i = 0; i < reversedbits.length;i++){
            reversedbits[reversedbits.length -1 -i] = bitsOfTheNum.charAt(i);
        }

      int reversedNum =  Integer.parseInt(String.valueOf(reversedbits), 2);

    }

    public static char[] cripto(char [] chars, int key){
        char[] criptografado = new char[chars.length];
        for (int i = 0; i < chars.length; i++){
            criptografado[i] = (char) (chars[i] ^ key);

        }


        return criptografado;
    }

}

/*
*
*   43261596	00000010100101000001111010011100
    964176192	00111001011110000010100101000000
    *           01010010100000111101001110000000
*                 111001011110000010100101
*
* */
