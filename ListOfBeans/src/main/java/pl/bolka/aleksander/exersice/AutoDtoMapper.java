package pl.bolka.aleksander.exersice;

import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AutoDtoMapper {

  public <E extends BaseEntity> BaseDto toDto(E entity) {
    return null;
  }

}
