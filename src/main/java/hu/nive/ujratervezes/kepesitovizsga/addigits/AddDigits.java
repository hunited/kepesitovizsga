package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int result = 0;
        for (Character character : input.toCharArray()) {
            if (Character.isDigit(character)) {
                result += Integer.parseInt(String.valueOf(character));
            }
        }
        return result;
    }

}
