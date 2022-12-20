package guru.springframework.sfgdi;

import com.springframework.pets.controllers.PetController;
import guru.springframework.sfgdi.config.SfgConfiguration;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.TempDataSource;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"guru.springframework.sfgdi","com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");

        System.out.println(i18nController.getGreeting());

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("-------------Primary");
        System.out.println(myController.getGreeting());

        System.out.println("-------------property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("--------- Bean Scopes -------");
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getMyScope());
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean2.getMyScope());

        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getMyScope());
        PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean2.getMyScope());

        TempDataSource dataSource = ctx.getBean(TempDataSource.class);
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getJdbcUrl());

        System.out.println("--------- Configuration Props Bean -------");
        SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
        System.out.println(sfgConfiguration.getUsername());
        System.out.println(sfgConfiguration.getPassword());
        System.out.println(sfgConfiguration.getJdbcUrl());
    }

}
