package pl.bolka.aleksander.exersice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnotherEntityDTO extends BaseDTO{

    PersonalData personalData;
    int age;
}
