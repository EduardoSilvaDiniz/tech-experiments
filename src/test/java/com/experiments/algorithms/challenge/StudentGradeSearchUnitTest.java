package com.experiments.algorithms.challenge;

import static com.experiments.algorithms.challenge.StudentGradeSearch.bucketSort;
import static com.experiments.algorithms.challenge.StudentGradeSearch.interpolationSearch;

import java.util.ArrayList;
import java.util.List;
import com.experiments.algorithms.base.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentGradeSearchUnitTest {

  @Test
  public void studentGradeSearchTest() {
    List<Student> students = new ArrayList<>();
    List<Integer> notes = new ArrayList<>();
    int targetGrade = 88;

    students.add(new Student("João", 78));
    students.add(new Student("Maria", 95));
    students.add(new Student("Carlos", 63));
    students.add(new Student("Ana", 88));
    students.add(new Student("Luiz", 91));
    students.add(new Student("Fernanda", 84));
    students.add(new Student("Pedro", 70));
    students.add(new Student("Juliana", 85));

    for (Student student : students) notes.add(student.getGrade());

    List<Integer> sortedNotes = bucketSort(notes);

    System.out.println("Notas ordenadas: " + sortedNotes);

    int index = interpolationSearch(sortedNotes, targetGrade);

    Assertions.assertEquals(5, index);
  }
}
