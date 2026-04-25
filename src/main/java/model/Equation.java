package model;

import java.awt.Color;

import view.MathleView;

public class Equation {
    final public static String[] FOUR_DIGIT_VAILD_ARRAY = {
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
    final public static String FORMAT_DELIMITER = ",";
    final public static String NUMBER_DELIMITER = " ";

    final private int YELLOW_DELTA = 5;

    private int[] numbers;
    private String format;

    public Equation(int[] numbers, String format) {
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

    public Color findColor(int index, int number) {
        if(numbers[index] == number) {
            return MathleView.GREEN_PANNEL_COLOR;
        } else if(Math.abs(numbers[index] - number) < YELLOW_DELTA) {
            return MathleView.YELLOW_PANNEL_COLOR;
        } else {
            return MathleView.GRAY_PANNEL_COLOR;
        }

    }

    public boolean evaluateFourDigit() {
        if(format == null || numbers.length != 4) {
            return false;
        }

        // I looked into trying to not use 16 if statements, but it looks like this will have to do
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[0])) {
            return numbers[0] + numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[1])) {
            return numbers[0] + numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[2])) {
            return numbers[0] + numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[3])) {
            return numbers[0] + numbers[1] / (double) numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[4])) {
            return numbers[0] - numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[5])) {
            return numbers[0] - numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[6])) {
            return numbers[0] - numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[7])) {
            return numbers[0] - numbers[1] / (double) numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[8])) {
            return numbers[0] * numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[9])) {
            return numbers[0] * numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[10])) {
            return numbers[0] * numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[11])) {
            return numbers[0] * numbers[1] / (double) numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[12])) {
            return numbers[0] / (double) numbers[1] + numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[13])) {
            return numbers[0] / (double) numbers[1] - numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[14])) {
            return numbers[0] / (double) numbers[1] * numbers[2] == numbers[3];

        }
        if(format.equals(FOUR_DIGIT_VAILD_ARRAY[15])) {
            return numbers[0] / (double) numbers[1] / (double) numbers[2] == numbers[3];

        }
        return false;
        

    }

}
