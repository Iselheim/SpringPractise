package pl.bolka.aleksander.api;

public interface PasswordChecker {
    boolean isPasswordCorrect(String realPassword, String givenPassword);
}
