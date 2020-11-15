package pl.bolka.aleksander.task.cache;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.task.model.User;

@Service
@Slf4j
@Order(0)
public class UserCache implements IUserCache {

  private final Map<String, User> cache = new HashMap<>();

  @Override
  public User getUser(String id) {
    log.error("UserCache");
    return cache.get(id);
  }

  @Override
  public void setUser(User user) {
    cache.put(user.getId(), user);
  }
}
