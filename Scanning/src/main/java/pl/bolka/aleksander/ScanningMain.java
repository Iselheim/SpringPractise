package pl.bolka.aleksander;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.bolka.aleksander.api.PackBean;

@SpringBootApplication
public class ScanningMain {

  @Autowired
  private PackBean packBean;

  public static void main(String[] args) {
    SpringApplication.run(ScanningMain.class);
  }

}
