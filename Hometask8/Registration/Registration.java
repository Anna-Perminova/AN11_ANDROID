import java.util.Objects;
import java.util.Scanner;

public class Registration {

    protected void input() throws WrongLoginException, WrongPasswordException {
        System.out.println("Введите логин ");
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        System.out.println("Введите пароль");
        String password = in.nextLine();
        System.out.println("Повторите пароль");
        String confirmPassword = in.nextLine();
        if (check(login, password, confirmPassword) == true) {
            System.out.println("Регистрация произошла успешно");
        }
    }

    public static class WrongLoginException extends Exception {
        String massage;

        public WrongLoginException(String str) {
            massage = str;
        }

        public String toString() {
            return massage;
        }
    }

    public static class WrongPasswordException extends Exception {
        String massage;

        public WrongPasswordException(String str) {
            massage = str;
        }

        public String toString() {
            return massage;
        }
    }

    static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        int error = 0;
        try {
            if (login.isEmpty() || login == null) {
                error++;
                throw new WrongLoginException("Поле логин пустое");
            } else if (login.length() > 20) {
                error++;
                throw new WrongLoginException("Поле логин переполнено");
            } else if (!login.matches("\\w+")) {
                error++;
                throw new WrongLoginException("Поле логин содержит несуществующие символы ");
            }
        } catch (WrongLoginException e) {
            e.getMessage();
            e.printStackTrace();
        } finally {
            try {
                if (password.isEmpty() || password == null) {
                    error++;
                    throw new WrongPasswordException("Поле пароль пустое");
                } else if (password.length() > 20) {
                    error++;
                    throw new WrongPasswordException("Поле пароль переполнено");
                } else if (!Objects.equals(password, confirmPassword)) {
                    error++;
                    throw new WrongPasswordException("Пароли не совпадают");
                } else if (!password.matches("\\w+")) {
                    error++;
                    throw new WrongPasswordException("Поле пароль содержит несуществующие символы ");
                }
            } catch (WrongPasswordException e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
        if (error == 0) {
            return true;
        } else {
            return false;
        }
    }
}