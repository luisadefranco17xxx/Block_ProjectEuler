public class LargestPrimeFactorClass3 {
    public static void main(String[] args) {

        final int maxNumber=30;
        //double maxNumber=  600851475143;
        for (double i = 2; i <= maxNumber; i++) {

             if(isPrimeFaktor(i)){
                 System.out.println("The number "+i+" is a prime factor.");
             }
        }
    }
    public static boolean isPrimeFaktor(double value){
        for (double i = 2; i < value; i++) {
            if(value%i==0){
                return false;  //no Prime factor
            }
        }
        return true;
    }
}
