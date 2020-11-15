package pl.bolka.aleksander.service;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.bolka.aleksander.model.AuthData;

public class AuthServiceTest {

  @Test
  public void authorize() {
    AuthService authService = new AuthService(
        new FindByLoginService(),
        new UserService(),
        new RealPasswordService(),
        new ComparePasswordService());
    authService.authorize(new AuthData());
  }
}
