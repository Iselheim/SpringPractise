package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.model.User;

@Service
@Slf4j
public class UserService {

  public User getUser(String id){
    log.info("UserService.getUser");
    return new User();
  }

}
