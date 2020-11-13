package pl.bolka.aleksander;

import java.util.List;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NumberService {

  private final List<Number> numbers;

  public NumberService(List<Number> numbers) {
    this.numbers = numbers;
  }

  @PostConstruct
  public void run() {
    log.error(numbers.get(0).getNumber() + "");
    log.error(numbers.get(1).getNumber() + "");
    log.error(numbers.get(2).getNumber() + "");
  }
}
