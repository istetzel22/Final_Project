package model;

public class Equation {
    final public static String[] FOUR_NUMBER_VAILD_ARRAYS = {
        "_+_+_=_",
        "_+_-_=_",
        "_+_*_=_",
        "_+_/_=_",
        "_-_+_=_",
        "_-_-_=_",
        "_-_*_=_",
        "_-_/_=_",
        "_*_+_=_",
        "_*_-_=_",
        "_*_*_=_",
        "_*_/_=_",
        "_/_+_=_",
        "_/_-_=_",
        "_/_*_=_",
        "_/_/_=_"
    };

    @SuppressWarnings("unused")
    private int amountOfNumbers;
    private int[] numbers;
    private String format;

    public Equation(int[] numbers, String format) {
        this.amountOfNumbers = numbers.length;
        this.numbers = numbers;
        this.format = format;

    }

    public Equation() {
        numbers = null;
        format = "N/A";
        
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String printEquation() {
        StringBuilder returnString = new StringBuilder();
        int numberArrayIndex = 0;
        char letter;

        for(int i = 0; i < format.length(); i++) {
            letter = format.charAt(i);
            if(letter == '_') {
                returnString.append(numbers[numberArrayIndex]);
                numberArrayIndex++;
            } else {
                returnString.append(letter);
            }
        }
        return returnString.toString();

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(format);
        stringBuilder.append(",");
        for (int num : numbers) {
            stringBuilder.append(" " + num);
        }

        return stringBuilder.toString();

    }

    public static String printEquationArray(Equation[] equations) {
        StringBuilder returnString = new StringBuilder();
        for (Equation equation : equations) {
            returnString.append(equation.printEquation() + "\n");
        }
        return returnString.toString();

    }

    public boolean evaluateFourDigit() {
        if(format == null || amountOfNumbers != 4) {
            return false;
        }

        // I looked into trying to not use 16 if statements, but it looks like this will have to do
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[0])) {
            return numbers[0] + numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[1])) {
            return numbers[0] + numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[2])) {
            return numbers[0] + numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[3])) {
            return numbers[0] + numbers[1] / (double) numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[4])) {
            return numbers[0] - numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[5])) {
            return numbers[0] - numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[6])) {
            return numbers[0] - numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[7])) {
            return numbers[0] - numbers[1] / (double) numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[8])) {
            return numbers[0] * numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[9])) {
            return numbers[0] * numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[10])) {
            return numbers[0] * numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[11])) {
            return numbers[0] * numbers[1] / (double) numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[12])) {
            return numbers[0] / (double) numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[13])) {
            return numbers[0] / (double) numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[14])) {
            return numbers[0] / (double) numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_NUMBER_VAILD_ARRAYS[15])) {
            return numbers[0] / (double) numbers[1] / (double) numbers[2] == numbers[3];

        }
        return false;
        

    }

}
