package pl.bolka.aleksander.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.User;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public List<User> getAllUsers() {
    return Arrays.asList(new User("Rysiu"), new User("Zdzisiu"));
  }
}
