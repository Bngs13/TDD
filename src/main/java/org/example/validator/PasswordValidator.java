package org.example.validator;

import org.apache.commons.lang3.StringUtils;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if(StringUtils.isBlank(password)) {
            throw new IllegalArgumentException();
        }

        return true;
    }
}
