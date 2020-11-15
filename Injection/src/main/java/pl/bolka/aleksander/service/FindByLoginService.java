package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.FindByLogin;

@Service
@Slf4j
class FindByLoginService implements FindByLogin {

  public String find(String login) {
    log.info("FindByLoginService.find");
    return "1";
  }

}
