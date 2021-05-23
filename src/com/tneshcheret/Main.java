package com.tneshcheret;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String workingSentence = scanner.nextLine();
        System.out.println("Введите слово");
        String workingWord = scanner.nextLine();
        System.out.println("Что нужно сделать с предложением? (indexPosition, quantityDuplication, SentenceAfterDelete)");
        String operation = scanner.nextLine();
        System.out.println("Куда вывести результат? (File, Console)");
        String typeWriteResult = scanner.nextLine();

        String result = doOperation(workingSentence, workingWord, operation);
        writeResult(result, typeWriteResult);
    }

    private static void writeResult(String result, String typeWriteResult) {
        Writer writer = null;
        switch (typeWriteResult) {
            case "File":
                writer = new ToFileWriter();
                break;
            case "Console":
                writer = new ConsoleWriter();
                break;
        }
        if (writer != null) {
            writer.write(result);
        }
    }

    private static String doOperation(String workingSentence, String workingWord, String operation) {
        StringWorker stringWorker = null;
        switch (operation) {
            case "indexPosition":
                stringWorker = new IndexPosition();
                break;
            case "quantityDuplication":
                stringWorker = new QuantityDuplication();
                break;
            case "SentenceAfterDelete":
                stringWorker = new SentenceAfterDelete();
        }
        if (stringWorker != null) {
            int result = stringWorker.execute(workingSentence, workingWord);
            return String.valueOf(result);
        }
        return "Ошибка. Внесены некорректные данные";
    }
}
