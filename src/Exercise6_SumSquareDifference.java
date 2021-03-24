public class Exercise6_SumSquareDifference {
    public static void main(String[] args) {
        double sumOfSquare=0;
        double squareOfSum=0;

        sumOfSquare=findsumOfSquare();
        squareOfSum=findsquareOfSum();
        System.out.println("squareOfSum = " + squareOfSum);
        System.out.println("sumOfSquare = " + sumOfSquare);
        System.out.println("squareOfSum-sumOfSquare = " + (squareOfSum-sumOfSquare));
    }

    public static double findsumOfSquare(){
        double sum=0.0;
        for (int i = 0; i <=10 ; i++) {
            sum=sum+Math.pow(i,2);

        }
        return sum;
    }

    public static double findsquareOfSum(){
        double sum=0.0;
        for (int i = 0; i <=10 ; i++) {
            sum=sum+i;
        }
        return Math.pow(sum,2);
    }
}
