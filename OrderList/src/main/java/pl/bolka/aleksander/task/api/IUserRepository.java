package pl.bolka.aleksander.task.api;

import pl.bolka.aleksander.task.model.User;

public interface IUserRepository {

  User getUser(String id);

}
