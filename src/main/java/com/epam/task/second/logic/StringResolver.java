package com.epam.task.second.logic;

import com.epam.task.second.entities.SimpleString;

public class StringResolver implements TaskTwo{
    public StringResolver() {}

    @Override
    public String replaceWords(SimpleString data, String substring) {
        String dataStr = data.getString();
        StringBuilder stringBuilder = new StringBuilder(dataStr);

        for(int i = 0; i < stringBuilder.length(); i++){
            int count = 0;
            while(i < stringBuilder.length() && stringBuilder.charAt(i) != ' '){
                if(!((stringBuilder.charAt(i) >= 65 && stringBuilder.charAt(i) <= 90) ||
                        (stringBuilder.charAt(i) >= 97 && stringBuilder.charAt(i) <= 122))){
                    break;
                }

                count++;
                i++;
            }
            if(count == substring.length()){
                stringBuilder.replace(i - count, i, substring);
            }
        }
        return stringBuilder.toString();

    }

    @Override
    public String replaceLetters(SimpleString data, Integer kOrder, char symbol) {
        String dataStr = data.getString();
        StringBuilder stringBuilder = new StringBuilder(dataStr);
        for(int i = 2; i < stringBuilder.length(); i += kOrder - 1) {
            stringBuilder.setCharAt(i, symbol);
        }
        return new String(stringBuilder);
    }
}
