package pl.bolka.aleksander.service;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.AuthData;
import pl.bolka.aleksander.model.User;

@Service
public class AuthService {

  @Autowired
  private FindByLogin findByLoginService;

  @Autowired
  private UserService userService;

  @Autowired
  private RealPasswordService realPasswordService;

  @Autowired
  private ComparePasswordService comparePasswordService;

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
