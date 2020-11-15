package pl.bolka.aleksander.task.database;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.task.api.IUserRepository;
import pl.bolka.aleksander.task.cache.IUserCache;
import pl.bolka.aleksander.task.model.User;

@Service
@Slf4j
@Order(1)
public class UserRepository implements IUserRepository {

  private final IUserCache userCache;

  public UserRepository(IUserCache userCache) {
    this.userCache = userCache;
  }

  @Override
  public User getUser(String id) {
    log.error("UserRepository");
    User user = User.builder()
                     .id(id)
                     .firstName("Jan")
                     .lastName("Kowalski")
                     .build();
    userCache.setUser(user);
    return user;
  }
}
