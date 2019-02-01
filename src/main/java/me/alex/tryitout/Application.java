package me.alex.tryitout;

import me.alex.tryitout.service.SpacecraftService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String... args) {
    //final SpacecraftService service = new SpacecraftServiceImpl();

    ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

    SpacecraftService service = appContext.getBean("spacecraftService", SpacecraftService.class);

    System.out.println(service.getShipRegistry().get(0).getShipName());
  }
}
