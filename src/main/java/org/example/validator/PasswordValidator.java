package org.example.validator;

import org.apache.commons.lang3.StringUtils;
import org.example.common.MessageConstant;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if(StringUtils.isBlank(password)) {
            throw new IllegalArgumentException();
        }
        if(password.length() > 10) {
            throw new IllegalArgumentException(MessageConstant.CHAR_LENGTH_ERROR_MESSAGE);
        }

        return true;
    }
}
