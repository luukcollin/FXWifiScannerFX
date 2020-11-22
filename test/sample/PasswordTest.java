package sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordTest {
    Password password = new Password("myKingdom");
    Password password2 = new Password("myasasword5");

    @Test
    public void safeLength(){
        assertTrue(password.isSafe());
    }

}