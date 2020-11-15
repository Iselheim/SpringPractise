package pl.bolka.aleksander.service;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.PasswordChecker;
import pl.bolka.aleksander.api.PasswordComparator;
import pl.bolka.aleksander.api.PasswordEncoder;

@Service
class PasswordCheckerService implements PasswordChecker {

    private final PasswordEncoder passwordEncoder;
    private final PasswordComparator passwordComparator;


    public PasswordCheckerService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.passwordComparator = new PasswordComparatorService();
    }

    @Override
    public boolean isPasswordCorrect(String realPassword, String givenPassword) {
        return passwordComparator.compare(passwordEncoder.encode(realPassword), givenPassword);
    }
}
