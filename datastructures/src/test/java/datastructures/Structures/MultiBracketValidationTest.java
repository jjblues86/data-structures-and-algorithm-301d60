package datastructures.Structures;

import org.junit.Before;
import org.junit.Test;
import utilities.MultiBracketValidation;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    MultiBracketValidation multiBracketValidation;

    @Before
    public void start(){
        multiBracketValidation = new MultiBracketValidation();
    }
    @Test public void testMultiBracketValidationParentheses(){
        String firstMatch = "()";
        assertTrue(MultiBracketValidation.multiBracketValidation(firstMatch));
    }
    @Test public void testMultiBracketValidationCurly(){
        String secondMatch = "{}";
        assertTrue(MultiBracketValidation.multiBracketValidation(secondMatch));
    }
    @Test public void testMultiBracketValidation(){
        String thirdMatch = "[]";
        assertTrue(MultiBracketValidation.multiBracketValidation(thirdMatch));
    }
    @Test public void testMultipleBracketValidation(){
        String fourthMatch = "{},[],()";
        assertTrue(MultiBracketValidation.multiBracketValidation(fourthMatch));
    }
    @Test public void testMultiBracketValidationExtraCharacters(){
        String fifthMatch = "()[[Extra Characters]]";
        assertTrue(MultiBracketValidation.multiBracketValidation(fifthMatch));
    }
    @Test public void testMultiBracketValidationFalse(){
        String sixthMatch = "[({}]";
        assertFalse(MultiBracketValidation.multiBracketValidation(sixthMatch));
    }
    @Test public void testMultiBracketValidationFalseMatch(){
        String seventhMatch = "(]([))";
        assertFalse(MultiBracketValidation.multiBracketValidation(seventhMatch));
    }
    @Test public void testMultiBracketValidationFalseMatch1() {
        String seventhMatch = "{(})";
        assertFalse(MultiBracketValidation.multiBracketValidation(seventhMatch));
    }

    }
