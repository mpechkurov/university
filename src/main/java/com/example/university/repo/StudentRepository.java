package com.example.university.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.university.domain.Person;
import com.example.university.domain.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    //Simple Methods
    List<Student> findByFullTime(boolean fullTime);
    List<Student> findByAge(Integer age);
    //findBy Attendee (-> links to Person.java DTO -> which have field) LastName
    List<Student> findByAttendeeLastName(String last);

    //Query Methods with Clauses and Expression
    Student findByAttendeeFirstNameAndAttendeeLastName(String firstName, String lastName);
    //this will have the same results as previous method
    Student findByAttendee(Person person);
    List<Student> findByAgeGreaterThan(int minimumAge);
    List<Student> findByAgeLessThan(int maximumAge);
    List<Student> findByAttendeeLastNameIgnoreCase(String lastName);
    List<Student> findByAttendeeLastNameLike(String likeString);
    //Find highest student in the aplhabet
    Student findFirstByOrderByAttendeeLastNameAsc();
    //Find the oldest student
    Student findTopByOrderByAgeDesc();
    List<Student> findTop3ByOrderByAgeDesc();

}
