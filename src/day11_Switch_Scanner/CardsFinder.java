package day11_Switch_Scanner;

public class CardsFinder {
    public static void main(String[] args) {
        int cardNumber = 34;
        int suitIndex = cardNumber / 13;
        int rankIndex = cardNumber % 13;
        String suit = "";
        String rank = "";
        //SOL Stat: "The card you picked is Jack of Hearts"
        if (cardNumber > 0 && cardNumber < 53) {
            switch (suitIndex) {
                case 0:
                    suit = "Clubs";
                    break;
                case 1:
                    suit = "Diamonds";
                    break;
                case 2:
                    suit = "Hearts";
                    break;
                default:
                    suit = "Spades";
                    break;
            }
            switch (rankIndex) {
                case 0:
                    rank = "King";
                    break;
                case 1:
                    rank = "Ace";
                    break;
                case 2:
                    rank = "Two";
                    break;
                case 3:
                    rank = "Three";
                    break;
                case 4:
                    rank = "Four";
                    break;
                case 5:
                    rank = "Five";
                    break;
                case 6:
                    rank = "Six";
                    break;
                case 7:
                    rank = "Seven";
                    break;
                case 8:
                    rank = "Eight";
                    break;
                case 9:
                    rank = "Nine";
                    break;
                case 10:
                    rank = "Ten";
                    break;
                case 11:
                    rank = "Jack";
                    break;
                default:
                    rank = "Queen";
            }
            System.out.println("The card you picked is " + rank + " of " + suit);

        } else {
            System.out.println("invalid card number, try again!");
        }
    }
}
