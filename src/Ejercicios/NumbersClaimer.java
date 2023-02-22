package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

class NumbersClaimer {

    private static final int REQUIRED_DIGITS = 10;

    private StringBuilder resultantNumber;

    private BufferedReader bufferedReader;

    NumbersClaimer() {
        this.resultantNumber = new StringBuilder();
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    private String askForDigit() throws IOException {
        System.out.print("Please, type a digit [0-9]:\t");
        return this.bufferedReader.readLine();
    }

    private boolean isOneSingleCharacter(String value) {
        return value.length() == 1;
    }

    private int getIntegerValue(String typedText) throws NumberFormatException {
        return Integer.parseInt(typedText);
    }

    private void askForNumber(int digitsCount) {
        do {
            try {
                String typedText = this.askForDigit();
                if (this.isOneSingleCharacter(typedText)) {
                    this.resultantNumber.append(this.getIntegerValue(typedText));
                } else {
                    throw new InputMismatchException(String.format("Only one single digit expected to be typed; " +
                                    "but none or more than one character was read in [%s].", typedText));
                }
            } catch (IOException e) {
                System.out.println("Error while reading input data:\t" + e.getMessage());
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Only positive integer digits are allowed [0-9]\t" + e.getMessage());
            }
        } while (resultantNumber.length() < digitsCount);

        System.out.printf("Here's your final %d digits number: %s", REQUIRED_DIGITS, this.resultantNumber);
    }

    public static void main(String[] args) {
        new NumbersClaimer().askForNumber(REQUIRED_DIGITS);
    }
}