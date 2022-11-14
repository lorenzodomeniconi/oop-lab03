package it.unibo.composition;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exam {
    int id, maxStudents, registeredStudents;
    String courseName;
    Professor professor;
    ExamRoom room;
    Student[] students;
    Exam(int id, int maxStudents, String courseName, Professor professor, ExamRoom room){
        this.id = id;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        registeredStudents = 0;
        students = new Student[maxStudents];
    }
    public void registerStudent(Student student){
        if(registeredStudents < maxStudents){
            students[registeredStudents] = student;
            registeredStudents++;
        }
    }

    public String toString(){
        String str;
        str = "nome corso: " + courseName + 
        "\n" + "nome professore: " + professor + 
        "\n" + "room: " + room + "\n" +
        "\n" + id + " " + maxStudents + " " + registeredStudents
        + "\n" + Arrays.toString(students);
        return str;
    }
}
