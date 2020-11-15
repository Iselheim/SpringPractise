package pl.bolka.aleksander.service;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.animaltask.AnimalType;
import pl.bolka.aleksander.api.Animal;

@Service
public class MouseService implements Animal {

  @Override
  public AnimalType getType() {
    return AnimalType.MOUSE;
  }

  @Override
  public String getVoice() {
    return "Pii";
  }
}
