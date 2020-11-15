package pl.bolka.aleksander.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.bolka.aleksander.model.User;
import pl.bolka.aleksander.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/all")
  public List<User> getUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/names")
  public List<String> getUserNames() {
    return userService.getAllUsers().stream()
        .map(User::getName)
        .collect(Collectors.toList());
  }

}
