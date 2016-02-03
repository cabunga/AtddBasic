package com.example.jimmymuchachasoy.myapplication;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by jimmy.muchachasoy on 03/02/2016.
 */
public class RobotiumTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;
    public RobotiumTest(){
        super(MainActivity.class);
    }
    public void setUp()throws Exception{
        solo= new Solo(getInstrumentation(), getActivity());
    }
    public void tearDown()throws  Exception{
        solo.finishOpenedActivities();
    }
    public void test_activity(){
        solo.assertCurrentActivity("activdad", MainActivity.class);
    }
    public void test_text(){
        assertTrue(solo.searchText("Hello World Jimmy!"));
    }
    public void test_button(){
        solo.clickOnButton("Buscar");
    }
}
