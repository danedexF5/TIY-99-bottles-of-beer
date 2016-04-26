/**
 * 99 bottles of beer
 */
public class NumberTranslator {
    public static String toWord(int number) {

        int tens = number / 10;
        int ones = number % 10;
        String tensAsText;
        String onesAsText;
        String word = "bottles";

        while (number > 0) {


            if (number < 1) {
                return "zero";
            }
            if (number == 1) {
                word = "bottle";
            }
            System.out.print(number + " " + word + " of beer on the wall");
            System.out.println(", " + number + " " + word + " of beer.");
            System.out.print("Take one down and ");
            System.out.print("pass it around, ");
            number = number - 1;

            if (number > 0) {
                System.out.println(number + " " + word + " of beer on the wall.");
                System.out.println(" ");
            } else {
                System.out.println("no more bottles of beer on the wall.");
            }
        }

            switch (tens) {
                case 2:
                    tensAsText = "twenty ";
                    break;
                case 3:
                    tensAsText = "thirty ";
                    break;
                case 4:
                    tensAsText = "forty ";
                    break;
                case 5:
                    tensAsText = "fifty ";
                    break;
                case 6:
                    tensAsText = "sixty ";
                    break;
                case 7:
                    tensAsText = "seventy ";
                    break;
                case 8:
                    tensAsText = "eighty ";
                    break;
                case 9:
                    tensAsText = "ninety ";
                    break;
                default:
                    tensAsText = "";
                    break;
            }

            switch (ones) {
                case 1:
                    onesAsText = "one ";
                    break;
                case 2:
                    onesAsText = "two ";
                    break;
                case 3:
                    onesAsText = "three ";
                    break;
                case 4:
                    onesAsText = "four ";
                    break;
                case 5:
                    onesAsText = "five ";
                    break;
                case 6:
                    onesAsText = "six ";
                    break;
                case 7:
                    onesAsText = "seven ";
                    break;
                case 8:
                    onesAsText = "eight ";
                    break;
                case 9:
                    onesAsText = "nine ";
                    break;
                default:
                    onesAsText = "";
                    break;
            }
            return tensAsText + "" + onesAsText;

    }

}
