package com.tneshcheret;

public class Main {

    public static void main(String[] args) {
        String workingSentence = "I like in walking in in the park in in";
        String workingWord = "in";
        IndexPosition indexPosition = new IndexPosition();
        System.out.println(indexPosition.execute(workingSentence, workingWord));
        QuantityDuplication quantityDuplication = new QuantityDuplication();
        System.out.println(quantityDuplication.execute(workingSentence, workingWord));
        SentenceAfterDelete sentenceAfterDelete = new SentenceAfterDelete();
        System.out.println(sentenceAfterDelete.execute(workingSentence, workingWord));
    }
}
