package com.example.university;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.university.domain.Course;
import com.example.university.repo.CourseRepository;
import com.example.university.view.CourseView;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DebuggingDemos {

    @Autowired
    private CourseRepository courseRepository;

    /**
     * Common Mistakes, Uncomment to debug
     *
     * Courses persisted to H2 in-Memory database at startup.
     *
     * @see UniversityApplication
     */
    @Test
    public void runtimeErrors() {

        Course course = courseRepository.findByDepartmentName("Sciences");

        CourseView view = courseRepository.getCourseViewByName("English 101").get();
        System.out.println(view);
        view = courseRepository.getCourseViewByName("English 101").orElseThrow();
        System.out.println(view);
        view = courseRepository.getCourseViewByName("English 100").orElse(new CourseView("dummyCourse",
                                                                                         "Bad Instructor",
                                                                                         "no department"));
        System.out.println(view);

    }

}
