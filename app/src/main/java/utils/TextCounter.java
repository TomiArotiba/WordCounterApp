package utils;

public class TextCounter  {
    public static String getCharsCount(String userInputText) {
        return String.valueOf(userInputText.length());
    }
    public static String getWordsCount(String userInputText) {
        return String.valueOf(userInputText.trim().split("\\W+").length);
    }
}
