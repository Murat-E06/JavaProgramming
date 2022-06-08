package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        /*
        Write a prog to convert numbers 0~9 to words.
        use ternary
         */
        int number = 9;

        /*
        There are 10 possibilities. first valid or invalid asks (pre cond.) under pre cond. 10 poss.
        1 outer if state, 1 outer else state,  1 inner if state. 8 inner else if state. 1 inner else state.
         */
        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three"
                        : (number == 4) ? "Four" : (number == 5) ? "Five" : (number == 6) ? "Six" : (number == 7) ? "Seven"
                        : (number == 8) ? "Eight" : "Nine"

                : "Invalid Number";

        System.out.println(result);


    }
}
