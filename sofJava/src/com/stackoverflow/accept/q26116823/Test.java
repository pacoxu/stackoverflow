package com.stackoverflow.accept.q26116823;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;


public class Test extends TestCase {

    private static String password = "s";
    private static String getPassword(){
        return password + "a";
    }

    public void testFail() {
        for(int i = 0 ; i < 100; i ++){
            assertEquals("a" , getPassword());
        }
    }


    public void testLoopToSave() {
        List<AssertionError> errorS = new ArrayList<AssertionError>();
        for(int i = 0 ; i < 100; i ++){
            try{
                assertEquals("a" , getPassword());
            }catch(AssertionError e){
                errorS.add(e);
            }
        }
        assertTrue( getAllErrorMessageTrace(errorS) , errorS.size() == 0 );
    }

    private String getAllErrorMessageTrace(List<AssertionError> errorS) {
        // TODO Auto-generated method stub
        return "";
    }

    public void testLoopJustCountAndLogging() {
        boolean errorFlag = false;
        for(int i = 0 ; i < 100; i ++){
            try{
                assertEquals("a" , getPassword());
            }catch(AssertionError e){
                System.out.println( i + ": " + e.getMessage() );
                errorFlag = true;
            }
        }
        assertTrue( "Some errors that you can find in log. ", errorFlag);   
    }
}