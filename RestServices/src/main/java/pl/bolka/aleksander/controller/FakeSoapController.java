package pl.bolka.aleksander.controller;

import java.util.List;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.service.UserService;

@Service
public class FakeSoapController {

  private final UserService userService;

  public FakeSoapController(UserService userService) {
    this.userService = userService;
  }

  public List<User> getAllUsers(){
    return userService.getAllUsers();
  }

}
