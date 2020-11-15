package pl.bolka.aleksander.exersice;

import org.springframework.stereotype.Service;

@Service
public class ExampleEntityMapper implements EntityMapper<ExampleEntityDTO, ExampleEntity> {

    @Override
    public ExampleEntityDTO toDTO(ExampleEntity entity) {
        return new ExampleEntityDTO(
                entity.getFirstName(),
                entity.getLastName()
        );
    }

    @Override
    public Class<ExampleEntity> getType() {
        return ExampleEntity.class;
    }
}
