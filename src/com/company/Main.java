package com.company;
import java.util.*;

/*
 * Класс Main
 * @version   1.1 04 Nov 2018
 * @author    Anastasia Mironova
 */
public class Main {

    public static void main(final String[] args) {
        int numb;
        String login;
        String password;
        String currentLogin;

        Scanner in = new Scanner(System.in);
        Map<String, String>  userData = new HashMap<String, String>();
        System.out.println("Enter number of users: ");
        numb = Integer.parseInt(in.nextLine());
        for (int i = 0; i < numb; i++) {
            System.out.println("Enter login: ");
            login = in.nextLine();
            System.out.println("Enter password: ");
            password = in.nextLine();
            userData.put(login, password);
        }


        System.out.println("Enter required login: ");
        currentLogin = in.nextLine();
        for (Map.Entry<String, String> entry: userData.entrySet()) {
            if (currentLogin.equals(entry.getKey())) {
                System.out.println("Login: " + entry.getKey() + ", Password: " + userData.get(entry.getKey()));
            }

        }

    }
}
