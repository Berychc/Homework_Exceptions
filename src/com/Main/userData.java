package com.Main;

import com.Exceptions.WrongLoginException;
import com.Exceptions.WrongPasswordException;

public class userData {
    public static void dataChecking(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
                throw new WrongLoginException("Некорректный логин");
            }
            if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
                throw new WrongPasswordException("Некорректный пароль");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
