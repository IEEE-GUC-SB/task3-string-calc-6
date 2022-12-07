public class StringCalc {
    public int Add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else if (numbers.length() == 3) {
            return Integer.parseInt("" + numbers.charAt(0)) + Integer.parseInt("" + numbers.charAt(2));
        } else {
            return Integer.parseInt(numbers);
        }

    }
}