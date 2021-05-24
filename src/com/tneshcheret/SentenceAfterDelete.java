package com.tneshcheret;

public class SentenceAfterDelete implements StringWorker {
    // вернуть кол-во символов в предложение, если удалить все такие слова

    @Override
    public int execute(String sentence, String word) {
        if (sentence.contains(" " + word + " ") || sentence.contains(" " + word) || sentence.contains(word + " ")) {
            String[] partsSentence = sentence.split("\\s+");
            for (int i = 0; i < partsSentence.length; i++) {
                if (partsSentence[i].equalsIgnoreCase(word)) {
                    partsSentence[i] = "";
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < partsSentence.length; i++) {
                if (i == partsSentence.length - 1) {
                    stringBuilder.append(partsSentence[i]);
                } else {
                    stringBuilder.append(partsSentence[i]).append(" ");
                }
            }
            System.out.println(stringBuilder);
            return stringBuilder.length();
        }
        return sentence.length();
    }
}
