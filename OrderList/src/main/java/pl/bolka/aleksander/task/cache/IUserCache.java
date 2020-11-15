package pl.bolka.aleksander.task.cache;

import pl.bolka.aleksander.task.api.IUserRepository;
import pl.bolka.aleksander.task.model.User;

public interface IUserCache extends IUserRepository {

  void setUser(User user);

}
