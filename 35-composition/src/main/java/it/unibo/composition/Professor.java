package it.unibo.composition;

public class Professor implements User{
    int id;
    String name, surname, password;
    String[] courses;

    Professor(int id, String name, String surname, String password, String[] courses){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public void replaceCourse(String course, int index){
        courses[index] = course;
    }

    public void replaceAllCourses(String[] courses){
        this.courses = courses;
    }

    public String getUsername(){
        return name+"."+surname;
    }

    public String getDescription(){
        return "nome: "+name+"  cognome: "+surname;
    }

    public String getPassword(){
        return password;
    }
    
}
