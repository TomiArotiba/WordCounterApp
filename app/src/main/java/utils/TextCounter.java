package utils;

public class TextCounter  {
    public static String getCharsCount(String inputCharacters) {
        return String.valueOf(inputCharacters.length());
    }
    public static String getWordsCount(String inputWords) {
        return String.valueOf(inputWords.trim().split("\\W+").length);
    }
}
