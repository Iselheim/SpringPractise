package pl.bolka.aleksander;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
public class One implements Number {

  @Override
  public int getNumber() {
    return 1;
  }
}
