package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ComparePasswordService {

  public boolean compare(String pass1, String pass2) {
    log.info("ComparePasswordService.compare");
    return true;
  }

}
