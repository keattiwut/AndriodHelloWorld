package com.example.keattiw.andriodhelloworld;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mActivity;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(false);
        mActivity = getActivity();
    }

    public void testHelloWorld(){
        TextView t = (TextView) mActivity.findViewById(R.id.txtHello);
        assertEquals("HelloWorld" , t.getText().toString());
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
