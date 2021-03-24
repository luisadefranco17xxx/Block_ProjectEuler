public class Exercise5_SmallestMultiple {
    public static void main(String[] args) {
        int myNumber=0;
        int MAX=1000000000;     //the result is 232792560!!
        for (int i = 2; i < MAX; i++) {
            if(findObEvenlyDivisible(i)){
                myNumber=i;
                break;
            }
        }
        if(myNumber==0) {
            System.out.println("kein EvenlyDivisible unter = " + MAX);
        } else {
            System.out.println("the littlest EvenlyDivisible is myNumber = " + myNumber);
        }
    }
    public static boolean findObEvenlyDivisible(int number){
        for (int i = 2; i <= 20; i++) {
            if(number%i!=0) return false;
        }
        return true;
    }
}
