package payroll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repostory) {
        return args -> {
            repostory.save(new Employee("talor", "swift", "thief"));
            repostory.save(new Employee("Bilbo", "Baggins", "burglar"));
            repostory.save(new Employee("Barack","Obama", "designer"));
        };
    }
}
