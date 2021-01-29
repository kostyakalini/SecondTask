package com.epam.task.second.logic;

import com.epam.task.second.entities.SimpleString;

public class CharacterResolver implements TaskTwo{
    @Override
    public String replaceWords(SimpleString data, String substring) {
        String dataStr = data.getString();
        char[] charString = dataStr.toCharArray();

        for(int i = 0; i < charString.length; i++){
            int count = 0;
            while(i < charString.length && charString[i] != ' '){
                if(!((charString[i] >= 65 && charString[i] <= 90) ||
                        (charString[i] >= 97 && charString[i] <= 122))){
                    break;
                }
                count++;
                i++;
            }
            if(count == substring.length()){
                count = i - count;
                for(int j = 0; count < i; count++, j++){
                    charString[count] = substring.charAt(j);
                }
            }
        }
        return new String(charString);

    }

    @Override
    public String replaceLetters(SimpleString data, Integer kOrder, char symbol) {
        String dataStr = data.getString();
        char[] charString = dataStr.toCharArray();
        for(int i = 2; i < charString.length; i += kOrder - 1) {
            charString[i] = symbol;
        }
        return new String(charString);
    }

    public CharacterResolver() {}
}
