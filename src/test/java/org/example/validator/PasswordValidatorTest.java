package org.example.validator;

import org.example.common.TestConstant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {


    @Test
    public void should_throw_exception_when_password_is_empty_string() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValid(""));

        assertNotNull(ex);
        assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    @Test
    public void should_throw_illegal_argument_exception_when_password_is_empty_string() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValid(""));

        assertNotNull(ex);
        assertEquals(IllegalArgumentException.class, ex.getClass());
    }


    @Test
    public void should_throw_illegal_argument_exception_when_password_is_blank() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValid(" "));

        assertNotNull(ex);
        assertEquals(IllegalArgumentException.class, ex.getClass());
    }

    @Test
    public void should_throw_illegal_argument_exception_when_password_is_null() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () -> PasswordValidator.isValid(null));

        assertNotNull(ex);
        assertEquals(IllegalArgumentException.class, ex.getClass());
    }


    @Test
    public void should_return_nothing_when_password_is_valid() {
        Boolean isPasswordValid = PasswordValidator.isValid(TestConstant.VALID_PASSWORD);
        assertNotNull(isPasswordValid);
        assertEquals(true, isPasswordValid);
    }

}