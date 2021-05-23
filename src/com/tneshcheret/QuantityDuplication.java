package com.tneshcheret;

public class QuantityDuplication implements StringWorker {
    //вернуть количество повторений

    @Override
    public int execute(String sentence, String word) {
        if (sentence.contains(" " + word + " ") || sentence.contains(" " + word) || sentence.contains(word + " ")) {
            String[] partsSentence = sentence.split("\\s+");
            int countersDuplication = 0;
            for (String s : partsSentence) {
                if (s.equalsIgnoreCase(word)) {
                    countersDuplication++;
                }
            }
            return countersDuplication;
        }
        return 0;
    }
}
