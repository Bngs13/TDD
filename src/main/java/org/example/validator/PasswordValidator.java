package org.example.validator;

import org.apache.commons.lang3.StringUtils;
import org.example.common.MessageConstant;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (StringUtils.isBlank(password)) {
            throw new IllegalArgumentException();
        }
        int passwordLength = password.length();
        if (passwordLength > 10) {
            throw new IllegalArgumentException(MessageConstant.MAX_CHAR_LENGTH_ERROR_MESSAGE);
        }
        if (passwordLength < 5) {
            throw new IllegalArgumentException(MessageConstant.MIN_CHAR_LENGTH_ERROR_MESSAGE);
        }

        return true;
    }
}
