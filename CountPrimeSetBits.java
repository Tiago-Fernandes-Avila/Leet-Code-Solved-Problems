public class CountPrimeSetBits {

    void main(){
      var count = new CountPrimeSetBits().countPrimeSetBits(6, 10); //0010, 0011, 0100, 0101, 0110, 0111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111
        IO.println("Quantidade de primes: " + count);
    }

    public int countPrimeSetBits(int left, int right) {
        int numberOfPrimes = 0;
        for(int i = left; i <= right; i++){
            int countOfOnes = 0;
            String binaryRepresentation = Integer.toBinaryString(i);
            for(int j = 0; j < binaryRepresentation.length(); j++){

                if(binaryRepresentation.charAt(j) == '1'){
                    countOfOnes++;
                }

            }
            if(checkPrime(countOfOnes)){
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }
    public boolean checkPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n / 2; i++){
            if (n % i == 0){
                return false;
            }

        }
        return true;
    }

}

//0110,0111, 1000,1001, 1010



