package pl.bolka.aleksander.api;

public interface PasswordComparator {
    boolean compare(String pass1, String pass2);
}
