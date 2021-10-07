public class NumberStringArray {
    public static String convert(long q) {
        String end = "";
        String[] names = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty ", "thirty ", "forty ","fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
        String[] places = {"", " thousand ", " million ", " billion ", " trillion ", " quadrillion ", " quintillion ", " sextillion ", " septillion ", " octillion ", " nonillion ", " decillion " };
        char n[] = new char[Long.toString(q).length()];
        int counter = 0;
        for(int i = n.length - 1; i >= 0; i--) {
            n[counter] = Long.toString(q).toCharArray()[i];
            counter++;
        }
        for(int i = n.length - 1; i >= 0; i--) {
            int intAgain = n[i] - 48;
            if (((i + 2) % 3 == 0) && (intAgain) == 1) {
                i--;
                intAgain = (intAgain) * 10 + (n[i] - 48);
            }
            else if (((i + 2) % 3 == 0 && intAgain != 0))
                intAgain += 18;
            end += names[intAgain];
            if ((i + 1) % 3 == 0 && intAgain != 0)
                end += " hundred ";
            if (i % 3 == 0 && i <= n.length - 3) {
                if (n[i] != '0' || n[i + 1] != '0' || n[i + 2] != '0')
                    end += places[i / 3];
            }
            else if(i % 3 == 0)
                end += places[i/3];
        }
        return end;
    }
}