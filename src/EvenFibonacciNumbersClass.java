public class EvenFibonacciNumbersClass {
    public static void main(String[] args) {

        int previousfibonacciNumber=1;
        int fibonacciNumber=2;
        int nextFibonacciNumber=0;
        double sum=0;

        while (fibonacciNumber<4000000) {
            if (fibonacciNumber%2==0){
                System.out.println("The even fibonacciNumber is : "+ fibonacciNumber);
                sum=sum+fibonacciNumber;
            }
            nextFibonacciNumber=previousfibonacciNumber+fibonacciNumber;
            previousfibonacciNumber=fibonacciNumber;
            fibonacciNumber=nextFibonacciNumber;
            //System.out.println("The fibonacciNumber is : "+ fibonacciNumber);
        }
        System.out.println("The sum is : "+sum);

    }
}
