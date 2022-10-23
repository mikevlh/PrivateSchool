/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ironm
 */
public class StudentCourse {

    private int studentId;
    private String stuFName;
    private String stuLName;
    private int courseId;
    private String courseTitle;
    private String stream;
    private String courseType;
    private Date startDate;
    private Date endDate;

    public StudentCourse() {
    }

    public StudentCourse(int studentId, String stuFName, String stuLName, int courseId, String courseTitle, String stream, String courseType, Date startDate, Date endDate) {
        this.studentId = studentId;
        this.stuFName = stuFName;
        this.stuLName = stuLName;
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.stream = stream;
        this.courseType = courseType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStuFName() {
        return stuFName;
    }

    public void setStuFName(String stuFName) {
        this.stuFName = stuFName;
    }

    public String getStuLName() {
        return stuLName;
    }

    public void setStuLName(String stuLName) {
        this.stuLName = stuLName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentCourse{studentId=").append(studentId);
        sb.append(", stuFName=").append(stuFName);
        sb.append(", stuLName=").append(stuLName);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", stream=").append(stream);
        sb.append(", courseType=").append(courseType);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }
}
