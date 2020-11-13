package pl.bolka.aleksander;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
public class Two implements Number {
  @Override
  public int getNumber() {
    return 2;
  }
}
