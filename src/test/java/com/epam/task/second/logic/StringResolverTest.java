package com.epam.task.second.logic;

import com.epam.task.second.entities.SimpleString;
import org.junit.Assert;
import org.junit.Test;

public class StringResolverTest {
    StringResolver stringResolver = new StringResolver();

    @Test
    public void testReplaceWordsNormal(){
        //given
        SimpleString stringBefore = new SimpleString("34qx 1c34c 34c ttt ccc");
        String substring = "sub";
        //when
        String actual = stringResolver.replaceWords(stringBefore, substring);
        //then
        Assert.assertEquals("34qx 1c34c 34c sub sub", actual);
    }

    @Test
    public void testReplaceWordsWithExtraSpaces(){
        //given
        SimpleString stringBefore = new SimpleString(" 34qx 1  c34c 34c t23 c32 ");
        String substring = "sub";
        //when
        String actual = stringResolver.replaceWords(stringBefore, substring);
        //then
        Assert.assertEquals(" 34qx 1  c34c sub sub sub ", actual);
    }

    @Test
    public void testReplaceWordsWithOutSpaces(){
        //given
        SimpleString stringBefore = new SimpleString("vq34tvq4tqv34t34t");
        String substring = "sub";
        //when
        String actual = stringResolver.replaceWords(stringBefore, substring);
        //then
        Assert.assertEquals("vq34tvq4tqv34t34t", actual);
    }

    @Test
    public void testReplaceLettersNormal(){
        //given
        SimpleString stringBefore = new SimpleString(" 34qx 1  c34c 34c t23 c32 ");
        Integer order = 4;
        char substring = '3';
        //when
        String actual = stringResolver.replaceLetters(stringBefore, order, substring);
        //then
        Assert.assertEquals(" 33qx31 3c33c 34c3t23 c32 ", actual);
    }
}
