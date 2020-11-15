package pl.bolka.aleksander.api;

import pl.bolka.aleksander.model.User;

public interface UserService {

    User findUserByLogin(String login);
}
