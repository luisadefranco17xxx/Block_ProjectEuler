import java.util.Arrays;

public class Problem4_LargestPalindromProduct {
    public static void main(String[] args) {

        System.out.println("findLargestPal() = " + findLargestPal());
    }

    public static int findLargestPal(){
        int palNumber=0;
        int myNumber=0;
        for (int i =100; i < 1000; i++) {
            for (int j = 100; j <1000 ; j++) {
                myNumber=i*j;
                 if( isPal(myNumber)){
                     palNumber=myNumber;
                 }
            }

        }

        return palNumber;
    }

    public static boolean isPal(int myNumber){
        int[] arr=new int[6];
//TODO    //es fehlt alles
        return false;
    }

}
