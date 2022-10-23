/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ironm
 */
public class StudentMoreThanOneCourse {

    private int studentId;
    private String studentFName;
    private String studentLName;

    public StudentMoreThanOneCourse() {
    }

    public StudentMoreThanOneCourse(int studentId, String studentFName, String studentLName) {
        this.studentId = studentId;
        this.studentFName = studentFName;
        this.studentLName = studentLName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFName() {
        return studentFName;
    }

    public void setStudentFName(String studentFName) {
        this.studentFName = studentFName;
    }

    public String getStudentLName() {
        return studentLName;
    }

    public void setStudentLName(String studentLName) {
        this.studentLName = studentLName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentMoreThanOneCourse{studentId=").append(studentId);
        sb.append(", studentFName=").append(studentFName);
        sb.append(", studentLName=").append(studentLName);
        sb.append('}');
        return sb.toString();
    }

}
