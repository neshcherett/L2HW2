package com.tneshcheret;

public class ConsoleWriter implements Writer {
    //записывает все данные в консоль

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}
