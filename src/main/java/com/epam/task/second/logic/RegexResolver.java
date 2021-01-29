package com.epam.task.second.logic;

import com.epam.task.second.entities.SimpleString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexResolver implements TaskTwo {

    @Override
    public String replaceWords(SimpleString data, String substring) {
        String dataStr = data.getString();
        int size = substring.length();
        String regex = String.format("\\b[a-zA-Z]{%d}\\b", size);
        //String str =
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dataStr);
        String value = matcher.replaceAll(substring);
        return dataStr.replaceAll(regex, substring);
    }

    public RegexResolver() {
    }

    @Override
    public String replaceLetters(SimpleString data, Integer kOrder, char symbol) {
        return null;
    }
}
