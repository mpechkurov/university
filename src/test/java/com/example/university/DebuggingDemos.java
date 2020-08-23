package com.example.university;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.university.repo.CourseRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DebuggingDemos {

    @Autowired
    private CourseRepository courseRepository;

    /**
     * Common Mistakes, Uncomment to debug
     *
     * Courses persisted to H2 in-Memory database at startup.
     * @see UniversityApplication
     */
    @Test
    public void runtimeErrors() {

        //        Course course = courseRepository.findByDeptName("Sciences");
        //
        //        Course view = courseRepository.getCourseViewByName("English 101");

    }

}
