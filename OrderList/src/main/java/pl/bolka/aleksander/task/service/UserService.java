package pl.bolka.aleksander.task.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.task.api.IUserRepository;
import pl.bolka.aleksander.task.model.User;

@Service
public class UserService {

  private final List<IUserRepository> userRepositories;

  public UserService(List<IUserRepository> userRepositories) {
    this.userRepositories = userRepositories;
  }

  public User getUserById(String id) {
    for (IUserRepository userRepository : userRepositories) {
      User user = userRepository.getUser(id);
      if (user != null){
        return user;
      }
    }
    return null;
  }

  @PostConstruct
  public void run() {
    User userById = getUserById("123");
    User userById2 = getUserById("123");
    System.out.println(userById);
  }


}
