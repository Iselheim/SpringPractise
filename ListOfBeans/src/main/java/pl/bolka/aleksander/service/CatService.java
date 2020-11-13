package pl.bolka.aleksander.service;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.Animal;

@Service
public class CatService implements Animal {

  @Override
  public String getVoice() {
    return "Meow!";
  }
}
