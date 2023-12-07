package com.Main;

import java.util.Scanner;
import com.Exceptions.WrongLoginException;
import com.Exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин - \n" );
        String login = scanner.nextLine();

        System.out.print("Введите пароль - \n");
        String password = scanner.nextLine();

        System.out.print("Введите второй раз пароль - \n");
        String confirmPassword = scanner.nextLine();

        try {
            userData.dataChecking(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}