import java.util.Arrays;

public class Problem4_LargestPalindromProduct {
    public static void main(String[] args) {
        int myNumber= 1234321;
        String myNumInStr ;
        myNumInStr= Integer.toString(myNumber);
        System.out.println("findLargestPal() = " + findLargestPal());
        //System.out.println("isPal(my) = " + isPal(myNumInStr));
    }

    public static int findLargestPal(){
        int biggestPalNumber=0;
        int myNumber;
        String myNumInStr ;
        //isPal(myNumber);
       for (int i =100; i < 1000; i++) {
            for (int j = 100; j <1000 ; j++) {
                myNumber=i*j;
                 myNumInStr= Integer.toString(myNumber);
                 if( isPal(myNumInStr)){
                     biggestPalNumber=myNumber;
                 }
            }
        }

        return biggestPalNumber;
    }

    public static boolean isPal(String myNumber){
        if(myNumber.length()==0 || myNumber.length()==1) {   //stop condition
            return true;
        }
        if(myNumber.charAt(0)==myNumber.charAt(myNumber.length()-1)){
            String subString =myNumber.substring(1,myNumber.length()-1);
            return isPal(subString);       //recursive call
        }
        return false;
    }

}
