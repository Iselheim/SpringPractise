package pl.bolka.aleksander.api;

import pl.bolka.aleksander.animaltask.AnimalType;

public interface Animal {

  AnimalType getType();

  String getVoice();

  default String getName(){
   return getClass().getSimpleName();
  }
}
