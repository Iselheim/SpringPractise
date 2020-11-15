package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.PasswordEncoder;

@Service
@Slf4j
class PasswordEncoderService implements PasswordEncoder {

  @Override
  public String encode(String password) {
    log.info("RealPasswordService.getRealPassword");
    return password.toLowerCase();
  }
}
