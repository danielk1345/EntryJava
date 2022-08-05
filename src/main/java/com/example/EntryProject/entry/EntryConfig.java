package com.example.EntryProject.entry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EntryConfig {
    @Bean
    CommandLineRunner commandLineRunner(EntryRepository repository){
        return args -> {
            Entry Entry1 = new Entry(
                    "EntryTest",
                    LocalDate.of(2022, Month.AUGUST, 4),
                    "Quick Test of entry test",
                    LocalDate.of(2022, Month.AUGUST, 4),
                    "Test"
            );
            Entry Entry2 = new Entry(
                    "EntryTest2",
                    LocalDate.of(2022, Month.AUGUST, 4),
                    "Quick Test2 of entry test",
                    LocalDate.of(2022, Month.AUGUST, 4),
                    "Test2"
            );

            repository.saveAll(
                    List.of(Entry1,Entry2)
            );
        };
    }
}
