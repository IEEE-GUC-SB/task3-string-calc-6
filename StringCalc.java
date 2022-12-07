public class StringCalc {
    public int Add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else if (numbers.length() > 2) {
            int sum = 0;
            char delimiter = ' ';
            if (numbers.length() >= 4) {
                if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
                    delimiter = numbers.charAt(2);
                    numbers = numbers.substring(4, numbers.length());
                }
            }
            for (int i = 0; i < numbers.length(); i++) {
                char currentChar = numbers.charAt(i);
                if (currentChar == delimiter) {
                    currentChar = ',';
                }
                if (currentChar == '\n') {
                    i++;
                    if (currentChar == ',') {
                        return -1;
                    }
                }
                if (currentChar == ',') {
                    if (currentChar == '\n') {
                        return -1;
                    }
                } else
                    sum += Integer.parseInt(currentChar + "");
            }
            return sum;
        } else {
            return Integer.parseInt(numbers);
        }

    }
}