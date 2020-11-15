package pl.bolka.aleksander.service;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.FindByLogin;
import pl.bolka.aleksander.api.UserSearch;
import pl.bolka.aleksander.api.UserService;
import pl.bolka.aleksander.model.User;

@Service
class UserServiceImpl implements UserService {

  private final FindByLogin findByLogin;

  private final UserSearch userSearch;

    public UserServiceImpl(FindByLogin findByLogin, UserSearch userSearch) {
        this.findByLogin = findByLogin;
        this.userSearch = userSearch;
    }

    @Override
    public User findUserByLogin(String login) {
        return userSearch.getUser(findByLogin.find(login));
    }
}
