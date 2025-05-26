
package quickchatapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickChatAppTest {
  @BeforeEach
    public void setup() {
        QuickChatApp.registeredUsername = "user_";
        QuickChatApp.registeredPassword = "Pass123!";
        QuickChatApp.registeredFirstName = "Test";
        QuickChatApp.registeredLastName = "User";
    }

    @Test
    public void testCheckUsername_Valid() {
        assertTrue(QuickChatApp.checkUsername("ab_c"));
    }

    @Test
    public void testCheckUsername_InvalidLength() {
        assertFalse(QuickChatApp.checkUsername("abcdef"));
    }

    @Test
    public void testCheckUsername_MissingUnderscore() {
        assertFalse(QuickChatApp.checkUsername("abcde"));
    }

    @Test
    public void testCheckPasswordComplexity_Valid() {
        assertTrue(QuickChatApp.checkPasswordComplexity("Strong1!A"));
    }

    @Test
    public void testCheckPasswordComplexity_TooShort() {
        assertFalse(QuickChatApp.checkPasswordComplexity("P1!a"));
    }

    @Test
    public void testCheckPasswordComplexity_MissingUppercase() {
        assertFalse(QuickChatApp.checkPasswordComplexity("pass123!"));
    }

    @Test
    public void testCheckPasswordComplexity_MissingDigit() {
        assertFalse(QuickChatApp.checkPasswordComplexity("Password!"));
    }

    @Test
    public void testCheckPasswordComplexity_MissingSpecialChar() {
        assertFalse(QuickChatApp.checkPasswordComplexity("Password1"));
    }

    @Test
    public void testCheckCellPhoneNumber_Valid() {
        assertTrue(QuickChatApp.checkCellPhoneNumber("+27831234567"));
    }

    @Test
    public void testCheckCellPhoneNumber_InvalidLength() {
        assertFalse(QuickChatApp.checkCellPhoneNumber("+2783123456789"));
    }

    @Test
    public void testCheckCellPhoneNumber_MissingCountryCode() {
        assertFalse(QuickChatApp.checkCellPhoneNumber("0831234567"));
    }

    @Test
    public void testLoginUser_Successful() {
        assertTrue(QuickChatApp.loginUser("user_", "Pass123!"));
    }

    @Test
    public void testLoginUser_Failure() {
        assertFalse(QuickChatApp.loginUser("wrong", "pass"));
    }

    @Test
    public void testReturnLoginStatus_Success() {
        String status = QuickChatApp.returnLoginStatus(true);
        assertTrue(status.contains("Welcome Test, User"));
    }

    @Test
    public void testReturnLoginStatus_Failure() {
        String status = QuickChatApp.returnLoginStatus(false);
        assertEquals("Username or password incorrect, please try again.", status);
    }

    private void assertTrue(boolean checkUsername) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertFalse(boolean checkUsername) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String username_or_password_incorrect_please_try, String status) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   

