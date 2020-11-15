package pl.bolka.aleksander.api;

import pl.bolka.aleksander.model.User;

public interface UserSearch {
    User getUser(String id);
}
