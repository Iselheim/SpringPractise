package pl.bolka.aleksander.exersice;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExampleEntity extends BaseEntity{

    private String firstName;
    private String lastName;
}
