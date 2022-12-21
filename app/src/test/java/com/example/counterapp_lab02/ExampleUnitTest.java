package com.example.counterapp_lab02;

import org.junit.Test;

import static org.junit.Assert.*;

import utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Test01GetEmptyChar() {
        String inputString = "";
        String actualResult;
        actualResult = TextCounter.getCharsCount(inputString);
        String expectedResult = "0";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void Test02GetSpaceChar() {
        String inputString = "    ";
        String actualResult;
        actualResult = TextCounter.getCharsCount(inputString);
        String expectedResult = "4";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void Test03GetSpecificChar() {
        String inputString = "abc";
        String actualResult;
        actualResult = TextCounter.getCharsCount(inputString);
        String expectedResult = "3";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test04GetRandomChar() {
        String inputString = "b82,2&!";
        String actualResult;
        actualResult = TextCounter.getCharsCount(inputString);
        String expectedResult = "7";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test05GetStatementChar() {
        String inputString = "This is a test statement";
        String actualResult;
        actualResult = TextCounter.getCharsCount(inputString);
        String expectedResult = "24";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test06GetEmptyWord() {
        String inputString = "";
        String actualResult;
        actualResult = TextCounter.getWordsCount(inputString);
        String expectedResult = "0";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void Test07GetSpaceWord() {
        String inputString = "    ";
        String actualResult;
        actualResult = TextCounter.getWordsCount(inputString);
        String expectedResult = "0";
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void Test08GetSpecificWord() {
        String inputString = "abc";
        String actualResult;
        actualResult = TextCounter.getWordsCount(inputString);
        String expectedResult = "1";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test09GetRandomWord() {
        String inputString = ",2&!";
        String actualResult;
        actualResult = TextCounter.getWordsCount(inputString);
        String expectedResult = "2";
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void Test10GetStatementWord() {
        String inputString = "This is a test statement";
        String actualResult;
        actualResult = TextCounter.getWordsCount(inputString);
        String expectedResult = "5";
        assertEquals(expectedResult, actualResult);
    }
}