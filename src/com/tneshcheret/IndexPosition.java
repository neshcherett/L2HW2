package com.tneshcheret;

public class IndexPosition implements StringWorker {
    //вернуть индекс числа где оно встречается. позицию первой встречи слова

    @Override
    public int execute(String sentence, String word) {
        if (sentence.contains(" " + word + " ") || sentence.contains(" " + word) || sentence.contains(word + " ")) {
            String[] partsSentence = sentence.split("\\s+");
            int numberCharacters = 0;
            for (String s : partsSentence) {
                numberCharacters += s.toCharArray().length + 1;
                if (s.equalsIgnoreCase(word)) {
                    return numberCharacters - (s.toCharArray().length + 1) + 1;
                }
            }
        }
        return 0;
    }
}
