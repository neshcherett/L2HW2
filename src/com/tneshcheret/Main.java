package com.tneshcheret;

public class Main {

    public static void main(String[] args) {
        String workingSentence = "I like in walking in in the park in in";
        String workingWord = "in";

        IndexPosition indexPosition = new IndexPosition();
        QuantityDuplication quantityDuplication = new QuantityDuplication();
        SentenceAfterDelete sentenceAfterDelete = new SentenceAfterDelete();
        ConsoleWriter consoleWriter = new ConsoleWriter();
        ToFileWriter toFileWriter = new ToFileWriter();

        consoleWriter.write(String.valueOf(indexPosition.execute(workingSentence, workingWord)));
        toFileWriter.write(String.valueOf(quantityDuplication.execute(workingSentence, workingWord)));
        System.out.println(sentenceAfterDelete.execute(workingSentence, workingWord));
    }
}
