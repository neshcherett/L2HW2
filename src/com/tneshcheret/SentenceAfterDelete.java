package com.tneshcheret;

public class SentenceAfterDelete implements StringWorker {
    // вернуть кол-во символов в предложение, если удалить все такие слова

    @Override
    public int execute(String sentence, String word) {
        String s = " " + word;
        String newSentence = sentence.replace(s, " ");
        return newSentence.length();
    }
}
