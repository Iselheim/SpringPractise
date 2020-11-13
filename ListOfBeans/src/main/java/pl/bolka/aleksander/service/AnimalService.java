package pl.bolka.aleksander.service;

import java.util.List;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.Animal;

@Service
@Slf4j
public class AnimalService {

  private final List<Animal> animals;

  public AnimalService(List<Animal> animals) {
    this.animals = animals;
  }

  @PostConstruct
  public void init(){
    animals.forEach(animal -> log.error(animal.getVoice()));
  }
}
