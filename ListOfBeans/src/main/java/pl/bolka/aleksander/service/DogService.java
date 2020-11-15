package pl.bolka.aleksander.service;

import org.springframework.stereotype.Service;
import pl.bolka.aleksander.animaltask.AnimalType;
import pl.bolka.aleksander.api.Animal;

@Service
public class DogService implements Animal {

  @Override
  public AnimalType getType() {
    return AnimalType.DOG;
  }

  @Override
  public String getVoice() {
    return "Bark!";
  }
}
