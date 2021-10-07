public class EsmailiConvert {
	public static String convert(long number) {
		if (number == 0) return "zero";
		String result = "";
		String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] tens = {"", "ten", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
		String[] suffix = {"", " thousand ", " million ", " billion ", " trillion ", " quadrillion ", " quintillion "};
		int digits[] = new int[Long.toString(number).length() + 1];
		int counter = 1, lastThree = 0;
		for (int i = digits.length - 2; i >= 0; i--)
			digits[counter++] = Long.toString(number).toCharArray()[i] - '0';
		for (int i = digits.length - 1; i >= 1; i--) {
			int next = digits[i];
			lastThree = (i % 3 == 0 ? next : lastThree * 10 + next);
			if (i % 3 == 0 && next > 0)
				result += ones[next] + " hundred ";
			if (i % 3 == 1)
				result += ones[next] + (lastThree == 0 ? "" : suffix[i / 3]);
			if (i % 3 == 2 && next > 0) {
				if (next >= 2)
					result += tens[next];
				else {
					int twoDigits = (next * 10) + digits[--i];
					result += ones[twoDigits] + suffix[i / 3];
				}
			}
		}
		return result;
	}
}