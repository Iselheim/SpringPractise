package pl.bolka.aleksander.exersice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappersController {

    private final AutoDtoMapper autoDtoMapper;

    public MappersController(AutoDtoMapper autoDtoMapper) {
        this.autoDtoMapper = autoDtoMapper;
    }

    @GetMapping("/test")
    public BaseDTO getDTO() {
        AnotherEntity entity = new AnotherEntity(new PersonalData("Imie", "Nazwiosko"), 78);
        return autoDtoMapper.toDto(entity);
    }
}
