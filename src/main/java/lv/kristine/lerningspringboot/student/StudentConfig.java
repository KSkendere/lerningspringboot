package lv.kristine.lerningspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student mariam = new Student(
                     "Mariam",
                    LocalDate.of(2000,
                    Month.JANUARY, 17),
                    "mariam.jamal@gmail.com");
            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2004,
                            Month.JANUARY, 17),
                    "alex.jamal@gmail.com");

            repository.saveAll(List.of (mariam,alex));
        };
    }
}
