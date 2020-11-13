package pl.bolka.aleksander.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bad")
public class BadController {

  private String id = "123";

  @GetMapping("/id")
  public String getId() {
    return id;
  }

  @GetMapping("/{id}")
  public void setId(@PathVariable("id") String id){
    this.id = id;
  }

}
