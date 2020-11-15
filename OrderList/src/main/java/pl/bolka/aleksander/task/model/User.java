package pl.bolka.aleksander.task.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {

  private String id;

  private String firstName;

  private String lastName;

}
