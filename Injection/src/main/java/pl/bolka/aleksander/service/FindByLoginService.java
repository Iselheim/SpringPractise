package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FindByLoginService implements FindByLogin {

  public String find(String login) {
    log.info("FindByLoginService.find");
    return "1";
  }

}
