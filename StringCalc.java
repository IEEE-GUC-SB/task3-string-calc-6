public class StringCalc {
    public int Add(String numbers) {
        if (numbers.equals(""))
            return 0;
        else if (numbers.length() > 2) {
            int sum = 0;
            char delimiter = ' ';
            String value = "";
            boolean flag = false;
            String delimiterString = "";
            if (numbers.length() >= 4) {
                if (numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
                    if (numbers.charAt(2) == '[') {
                        delimiter = numbers.charAt(3);
                        int k = 3;
                        while (numbers.charAt(k) != ']') {
                            delimiterString += numbers.charAt(k);
                            k++;
                        }
                        numbers = numbers.substring(k + 2, numbers.length());
                    } else {
                        delimiter = numbers.charAt(2);
                        numbers = numbers.substring(4, numbers.length());
                    }
                }
            }
            for (int i = 0; i < numbers.length(); i++) {
                char currentChar = numbers.charAt(i);
                if (currentChar == delimiter) {
                    if (!delimiterString.equals("")) {
                        while (numbers.charAt(i + 1) == delimiter) {
                            i++;
                        }
                        flag = true;
                    }
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

                }
                if (currentChar != ',') {
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