package com.example.TestUser;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void TestRegistrationFalse() {


        String login = "pochtamail.ru";
        String password = "password";
        User user = new User(login,password);

        assertEquals(CorrectUser.Correct, user.CanCreateUser(login,password));
    }

    @Test
    public void TestRegistrationTrue() {
        String login = "pochta@mail.ru";
        String password = "$PASsword1$";
        User user = new User(login,password);

        assertEquals(CorrectUser.Correct, user.CanCreateUser(login,password));
    }
}