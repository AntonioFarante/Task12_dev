package com.homework.spring_dev12;

import com.homework.spring_dev12.Entity.Note;
import com.homework.spring_dev12.Services.NoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringDev12Application {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(SpringDev12Application.class, args);

		NoteService noteService = new NoteService();

		noteService.add(new Note(1L, "First title", "Text"));
		noteService.add(new Note(2L, "Second title", "Text"));
		noteService.add(new Note(3L, "Third title", "Text"));
		noteService.add(new Note(4L, "Fourth title", "Text"));
//
//		System.out.println("noteService.listAll() = " + noteService.listAll());

		noteService.update(new Note(5L, "ddddd", "dsada"));
		System.out.println("noteService.getById(3L) = " + noteService.getById(3L));
	}

}
