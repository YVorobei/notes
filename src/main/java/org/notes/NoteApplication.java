package org.notes;

import org.notes.dao.NoteDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NoteApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(NoteDAO noteDAO) {
        return runner -> {

        };
    }
}