package pl.bolka.aleksander.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.AuthData;
import pl.bolka.aleksander.model.User;

@Service
public class AuthService {

  private final FindByLogin findByLoginService;

  private final UserService userService;

  private final RealPasswordService realPasswordService;

  private final ComparePasswordService comparePasswordService;

  public AuthService(FindByLogin findByLoginService,
                     UserService userService,
                     RealPasswordService realPasswordService,
                     ComparePasswordService comparePasswordService) {
    this.findByLoginService = findByLoginService;
    this.userService = userService;
    this.realPasswordService = realPasswordService;
    this.comparePasswordService = comparePasswordService;
  }

  public boolean authorize(AuthData authData) {
    String id = findByLoginService.find(authData.getLogin());
    User user = userService.getUser(id);
    String realPassword = realPasswordService.getRealPassword(user.getPassword());
    return comparePasswordService.compare(realPassword, authData.getPassword());
  }

  @PostConstruct
  public void start(){
    AuthData authData = new AuthData();
    authData.setLogin("Jan");
    authData.setPassword("Kaczka");
    authorize(authData);
  }
}
