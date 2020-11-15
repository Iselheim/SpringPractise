package pl.bolka.aleksander.service;

public class FindByLoginImpl implements FindByLogin {

  @Override
  public String find(String login) {
    return login;
  }
}
