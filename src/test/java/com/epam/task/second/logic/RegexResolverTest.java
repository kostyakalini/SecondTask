package com.epam.task.second.logic;

import com.epam.task.second.entities.SimpleString;
import org.junit.Assert;
import org.junit.Test;

public class RegexResolverTest {

    RegexResolver regexResolver = new RegexResolver();

    @Test
    public void testReplaceWordsWithOutSpaces(){
        //given
        SimpleString stringBefore = new SimpleString("aaq ccd ggce tff cqw");
        String substring = "sub";
        //when
        String actual = regexResolver.replaceWords(stringBefore, substring);
        //then
        Assert.assertEquals("sub sub ggce sub sub", actual);
    }
}
