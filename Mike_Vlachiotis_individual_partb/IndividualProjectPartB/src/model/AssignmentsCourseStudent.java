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
public class AssignmentsCourseStudent {

    private int studentId;
    private String studentFName;
    private String studentLName;
    private int courseId;
    private String courseTitle;
    private String courseStream;
    private String courseType;
    private Date startDate;
    private Date endDate;
    private int assId;
    private String assTitle;
    private Date subDateTime;

    public AssignmentsCourseStudent() {
    }

    public AssignmentsCourseStudent(int studentId, String studentFName, String studentLName, int courseId, String courseTitle, String courseStream, String courseType, Date startDate, Date endDate, int assId, String assTitle, Date subDateTime) {
        this.studentId = studentId;
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseStream = courseStream;
        this.courseType = courseType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.assId = assId;
        this.assTitle = assTitle;
        this.subDateTime = subDateTime;
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

    public String getCourseStream() {
        return courseStream;
    }

    public void setCourseStream(String courseStream) {
        this.courseStream = courseStream;
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

    public int getAssId() {
        return assId;
    }

    public void setAssId(int assId) {
        this.assId = assId;
    }

    public String getAssTitle() {
        return assTitle;
    }

    public void setAssTitle(String assTitle) {
        this.assTitle = assTitle;
    }

    public Date getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(Date subDateTime) {
        this.subDateTime = subDateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssignmentsCourseStudent{studentId=").append(studentId);
        sb.append(", studentFName=").append(studentFName);
        sb.append(", studentLName=").append(studentLName);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", courseStream=").append(courseStream);
        sb.append(", courseType=").append(courseType);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", assId=").append(assId);
        sb.append(", assTitle=").append(assTitle);
        sb.append(", subDateTime=").append(subDateTime);
        sb.append('}');
        return sb.toString();
    }

}
