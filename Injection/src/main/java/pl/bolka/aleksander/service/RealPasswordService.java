package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RealPasswordService {

  public String getRealPassword(String password) {
    log.info("RealPasswordService.getRealPassword");
    return password.toLowerCase();
  }
}
