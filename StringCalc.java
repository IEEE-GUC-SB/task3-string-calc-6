public class StringCalc {
    public int Add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else if (numbers.length() >= 3) {
            int sum = 0;
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) == '\n') {
                    i++;
                }
                if (numbers.charAt(i) != ',') {
                    sum += Integer.parseInt("" + numbers.charAt(i));
                }
            }
            return sum;
        } else {
            return Integer.parseInt(numbers);
        }

    }
}