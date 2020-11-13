package pl.bolka.aleksander.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@Data
@PropertySource("classpath:values.properties")
public class TestAnnotationBean {

  private String name;

  private int number;

  public TestAnnotationBean(@Value("${TestAnnotationBean.name}") String name,
                            @Value("${TestAnnotationBean.number}") int number) {
    this.name = name;
    this.number = number;
    System.out.println("TestAnnotationBean name: " + name);
    System.out.println("TestAnnotationBean number: " + number);
  }
}
