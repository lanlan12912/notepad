package com.example.notepad_base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.example.notepad_base.mapper")
@SpringBootApplication
public class NotepadBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotepadBaseApplication.class, args);
    }

}
