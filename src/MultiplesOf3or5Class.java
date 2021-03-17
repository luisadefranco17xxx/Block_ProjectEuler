public class MultiplesOf3or5Class {
    public static void main(String[] args) {
    int summ=0;
    final int maxNumber=1000;
        for (int i = 1; i <maxNumber ; i++) {
            if(i%3==0||i%5==0){
                summ=summ+i;
            }
        }
        System.out.println("The sum is :" +summ);

    }


}
