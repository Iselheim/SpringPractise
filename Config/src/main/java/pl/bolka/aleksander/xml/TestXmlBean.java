package pl.bolka.aleksander.xml;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestXmlBean {

  private String name;
  private long number;

  public TestXmlBean(String name, long number) {
    super();
    this.name = name;
    this.number = number;
  }
}
