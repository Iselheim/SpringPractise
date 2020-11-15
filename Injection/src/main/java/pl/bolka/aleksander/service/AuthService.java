package pl.bolka.aleksander.service;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.PasswordChecker;
import pl.bolka.aleksander.api.UserService;
import pl.bolka.aleksander.model.AuthData;
import pl.bolka.aleksander.model.User;

@Service
public class AuthService {

  private final UserService userService;
  private final PasswordChecker passwordChecker;

  public AuthService(UserService userService, PasswordChecker passwordChecker) {
    this.userService = userService;
    this.passwordChecker = passwordChecker;
  }

  public boolean authorize(AuthData authData) {
    User user = userService.findUserByLogin(authData.getLogin());
    return passwordChecker.isPasswordCorrect(user.getPassword(), authData.getPassword());
  }

  @PostConstruct
  public void start(){
    AuthData authData = new AuthData();
    authData.setLogin("Jan");
    authData.setPassword("Kaczka");
    authorize(authData);
  }
}
