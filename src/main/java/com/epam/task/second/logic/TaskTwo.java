package com.epam.task.second.logic;

public interface TaskTwo {
    //замена слов заданной длины на переданную подстроку
    public String replaceWords(String dataStr, Integer size, String substring);
    //замена k-ого символа каждого слова на заданным символом
    public String replaceLetters(String dataStr, Integer kOrder, char symbol);
}
