package com.example.dave.individualproject;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.Location;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    @Mock
    MainActivity databaseMock;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    Location testaddress;
    @Test
    public void addition_isCorrect() throws Exception {
        MainActivity testActivity = new MainActivity();
        testActivity.getHomeCoords();
    }
}