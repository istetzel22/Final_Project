package model;

public class Equation {
    final private String[] FOUR_NUMBER_VAILD_ARRAYS = {
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

    private int amountOfNumbers;
    private int[] numbers;
    private String format;

    public Equation(int[] numbers, String format) {
        this.amountOfNumbers = numbers.length;
        this.numbers = numbers;
        this.format = format;

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

        stringBuilder.append("Format: " + format);
        stringBuilder.append("\nNumbers:");
        for (int num : numbers) {
            stringBuilder.append(" " + num);
        }

        return stringBuilder.toString();

    }

    public boolean evaluate() {
        switch (format) {
            case FOUR_NUMBER_VAILD_ARRAYS[2]:
                
                break;
        
            default:
                break;
        }
        

    }

}
