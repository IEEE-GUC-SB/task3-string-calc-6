public class StringCalc {
    public int Add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else if (numbers.length() > 2) {
            int sum = 0;
            char delimiter = ' ';
            String value = "";
            boolean flag = false;
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
                    currentChar = ',';
                    if (numbers.charAt(i + 1) == ',') {
                        return -1;
                    }
                }
                if (currentChar == ',') {
                    if (numbers.charAt(i + 1) == ',') {
                        return -1;
                    }
                    if (flag == false) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                    // if (i == numbers.length() - 2) {
                    // flag = false;
                    // }

                } else {
                    value += currentChar;
                    if (flag == false || i == numbers.length() - 1 || numbers.charAt(i + 1) == ',') {
                        if (Integer.parseInt(value + "") <= 1000) {
                            sum += Integer.parseInt(value + "");
                        }
                        value = "";

                    }
                }
            }
            return sum;
        } else {
            return Integer.parseInt(numbers);
        }

    }
}