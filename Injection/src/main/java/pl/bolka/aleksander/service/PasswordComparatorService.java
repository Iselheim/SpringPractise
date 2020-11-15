package pl.bolka.aleksander.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.PasswordComparator;

@Slf4j
class PasswordComparatorService implements PasswordComparator {

  @Override
  public boolean compare(String pass1, String pass2) {
    log.info("ComparePasswordService.compare");
    return true;
  }

}
