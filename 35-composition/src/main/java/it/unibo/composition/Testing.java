package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student s1 = new Student(0, "lor", "dom", "ciao", 2020);
        Student s2 = new Student(1, "l", "d", "ciao", 2022);
        Student s3 = new Student(2, "lll", "d", "ciao", 2021);
        // 2)Creare 2 docenti a piacere
        Professor p1 = new Professor(100, "fab", "ne", "aaa", new String[] {"a", "b"});
        Professor p2 = new Professor(134, "ad", "dd", "aaa", new String[] {"d", "c"});
        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom r1 = new ExamRoom(100, "aaa", false, false);
        ExamRoom r2 = new ExamRoom(80, "a", false, false);
        
        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam ex1 = new Exam(2, 10, "aaa", p2, r2);
        Exam ex2 = new Exam(1, 2, "a", p1, r1);
        // 5) Iscrivere tutti e 3 gli studenti agli esami
        ex1.registerStudent(s1);
        ex1.registerStudent(s3);
        ex1.registerStudent(s2);
        ex2.registerStudent(s1);
        ex2.registerStudent(s2);
        ex2.registerStudent(s3);
        System.out.println(ex1.toString());
        System.out.println(ex2);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
    }
}
