package pl.bolka.aleksander.pack3;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import pl.bolka.aleksander.api.PackBean;

@Service
public class Pack3Bean implements PackBean {

  @PostConstruct
  public void run(){
    getName();
  }

}
