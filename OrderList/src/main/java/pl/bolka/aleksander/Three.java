package pl.bolka.aleksander;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(3)
@Service
public class Three implements Number {
  @Override
  public int getNumber() {
    return 3;
  }
}
