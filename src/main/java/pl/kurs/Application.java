package pl.kurs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.kurs.entity.*;
import pl.kurs.service.LaptopService;
import pl.kurs.service.PhoneService;
import pl.kurs.service.WorkersService;

@ComponentScan // mowimy springowi ze ma szukac klas zarzadzanych przez niego od katalogu pl.kurs
                // (bo tu znajduje sie klasa Application wszedzie wgłąb, mozemy to zmienic podajac w argumencie
                // adnotacji @ComponentScan pakiet w ktorym ma zaczac szukac np. @ComponentScan("pl.kurs.entity")
@Configuration
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Application.class);

        LaptopService laptopService = ctx.getBean(LaptopService.class);
//        Laptop laptop = new Laptop("Lenovo", "Legion", 4000.0, 5, Condition.New);
//        laptopService.save(laptop);

        System.out.println(laptopService.findById(1L));

        PhoneService phoneService = ctx.getBean(PhoneService.class);
        Phone phone = new Phone();
        phoneService.save(phone);

//        WorkersService workersService = ctx.getBean(WorkersService.class);
//        Workers workers = new Workers("Adam", "Przekładam", 2500.0, Position.SELLER);
//        workersService.save(workers);

        ctx.close();
    }
}
