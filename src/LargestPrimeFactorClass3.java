public class LargestPrimeFactorClass3 {
    public static void main(String[] args) {

        //final int maxNumber=330;
        long maxNumber;
        //maxNumber = 600851475143;
        maxNumber = 600851475;
        for (long i = 2; i <= maxNumber; i++) {

             if(isPrimeFaktor(i)){
                 System.out.println("The number "+i+" is a prime factor.");
             }
        }
    }
    public static boolean isPrimeFaktor(long value){
        for (long i = 2; i < value; i++) {      //hier kann ich "value/2"   statt "value" schreiben.
            if(value%i==0){
                return false;  //no Prime factor
            }
        }
        return true;
    }
}
