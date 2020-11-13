package pl.bolka.aleksander.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationMain {

  public static void main( String[] args )
  {
    ClassPathXmlApplicationContext ac =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    TestXmlBean testXmlBean = (TestXmlBean) ac.getBean("textXmlBean");
    String name = testXmlBean.getName();
    System.out.println("testXmlBean name: "+name);
    long population = testXmlBean.getNumber();
    System.out.println("testXmlBean number: "+population);
    ac.close();
  }
}
