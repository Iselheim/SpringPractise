package pl.bolka.aleksander.service;

import java.util.List;
import java.util.function.Consumer;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.animaltask.AnimalType;
import pl.bolka.aleksander.api.Animal;

@Service
@Slf4j
public class AnimalService {

  private final List<Animal> animals;

  public AnimalService(List<Animal> animals) {
    this.animals = animals;
  }

  @PostConstruct
  public void init() {
    AnimalType dog = AnimalType.DOG;
    runAction(dog, animal -> log.error(animal.getVoice()));
    runAction(AnimalType.MOUSE, animal -> log.info(animal.getName()));
  }

  private void runAction(AnimalType dog, Consumer<Animal> animalConsumer) {
    animals.stream()
           .filter(animal -> animal.getType().equals(dog))
           .findFirst()
           .ifPresent(animalConsumer);
  }
}
