package pl.bolka.aleksander.exersice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AutoDtoMapper {

  private final List<EntityMapper> mappers;

  public AutoDtoMapper(List<EntityMapper> mappers) {
    this.mappers = mappers;
  }

  public <E extends BaseEntity> BaseDTO toDto(E entity) {

    return mappers.stream()
            .filter(mapper -> mapper.getType().equals(entity.getClass()))
            .findFirst()
            .map(mapper -> mapper.toDTO(entity))
            .orElseThrow(() -> new RuntimeException("Not implemented yet"));
  }
}
