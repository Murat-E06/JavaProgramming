package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int[]numbers={10,5,4,20,1,0};
        int max=numbers[0];//assumption, it may be not correct!
/*
        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);

 */
        for (int number : numbers) {
            if(number>max){
                max=number;
        }
        }
        System.out.println(max);




    }
}
