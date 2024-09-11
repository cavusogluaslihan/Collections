package com.example.collections;

public class SchoolEnrolmentStudyCase_Students {
    private String nameOfTheStudent;
    private  int idOfTheStudent;

    public SchoolEnrolmentStudyCase_Students() {
    }

    public SchoolEnrolmentStudyCase_Students(String nameOfTheStudent, int idOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.idOfTheStudent = idOfTheStudent;
    }

    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public int getIdOfTheStudent() {
        return idOfTheStudent;
    }

    public void setIdOfTheStudent(int idOfTheStudent) {
        this.idOfTheStudent = idOfTheStudent;
    }
}
