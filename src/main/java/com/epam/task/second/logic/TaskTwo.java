package com.epam.task.second.logic;

import com.epam.task.second.entities.SimpleString;

public interface TaskTwo {
    //замена слов заданной длины на переданную подстроку
    public String replaceWords(SimpleString data, String substring);
    //замена k-ого символа каждого слова на заданным символом
    public String replaceLetters(SimpleString data, Integer kOrder, char symbol);
}
