
public class NumberTranslator {

    public static void rhyme(int number) {

        String word = "bottles";

        while (number > 0) {
            if (number == 1) {
                word = "bottle";
            }
            String numberInWords = numberToWords(number);
            System.out.print(Character.toUpperCase(numberInWords.charAt(0))
                    + numberInWords.substring(1)
                    + " " + word + " of beer on the wall");
            System.out.println(", " + numberInWords + " " + word + " of beer.");
            System.out.print("Take one down and ");
            System.out.print("pass it around, ");
            number = number - 1;

            numberInWords = numberToWords(number);
            if (number > 0) {
                System.out.println(numberInWords + " " + word + " of beer on the wall.");
                System.out.println(" ");
            } else {
                System.out.println("no more bottles of beer on the wall.");
            }
        }

    }

    public static String numberToWords(int number) {
        int tens = number / 10;
        int ones = number % 10;
        String tensAsText;
        String onesAsText;

        if (number >= 11 && number <= 19) {
            String t;
            switch (number) {
                case 11:
                    t = "eleven";
                    break;
                case 12:
                    t = "twelve";
                    break;
                case 13:
                    t = "thirteen";
                    break;
                case 14:
                    t = "fourteen";
                    break;
                case 15:
                    t = "fifteen";
                    break;
                case 16:
                    t = "sixteen";
                    break;
                case 17:
                    t = "seventeen";
                    break;
                case 18:
                    t = "eighteen";
                    break;
                case 19:
                    t = "nineteen";
                    break;
                default:
                    t = "";
            }

            return t;
        }

        switch (tens) {
            case 1:
                tensAsText = "ten ";
                break;
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