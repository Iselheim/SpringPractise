package pl.bolka.aleksander.exersice;

import org.springframework.stereotype.Service;

@Service
public class AnotherEntityMapper implements EntityMapper<AnotherEntityDTO, AnotherEntity>{
    @Override
    public AnotherEntityDTO toDTO(AnotherEntity entity) {
        return new AnotherEntityDTO(new PersonalData(entity.getPersonalData().getFirstName()
                , entity.personalData.lastName), entity.getAge());
    }

    @Override
    public Class<AnotherEntity> getType() {
        return AnotherEntity.class;
    }
}
