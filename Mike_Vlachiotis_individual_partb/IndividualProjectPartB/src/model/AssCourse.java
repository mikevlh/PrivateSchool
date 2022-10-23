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
public class AssCourse {

    private int courseId;
    private String courseTitle;
    private String courseStream;
    private String courseType;
    private Date courseStartDate;
    private Date courseEndDate;
    private int assId;
    private String assTitle;
    private Date subDateTime;

    public AssCourse() {
    }

    public AssCourse(int courseId, String courseTitle, String courseStream, String courseType, Date courseStartDate, Date courseEndDate, int assId, String assTitle, Date subDateTime) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseStream = courseStream;
        this.courseType = courseType;
        this.courseStartDate = courseStartDate;
        this.courseEndDate = courseEndDate;
        this.assId = assId;
        this.assTitle = assTitle;
        this.subDateTime = subDateTime;
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

    public Date getCourseStartDate() {
        return courseStartDate;
    }

    public void setCourseStartDate(Date courseStartDate) {
        this.courseStartDate = courseStartDate;
    }

    public Date getCourseEndDate() {
        return courseEndDate;
    }

    public void setCourseEndDate(Date courseEndDate) {
        this.courseEndDate = courseEndDate;
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
        sb.append("AssCourse{courseId=").append(courseId);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", courseStream=").append(courseStream);
        sb.append(", courseType=").append(courseType);
        sb.append(", courseStartDate=").append(courseStartDate);
        sb.append(", courseEndDate=").append(courseEndDate);
        sb.append(", assId=").append(assId);
        sb.append(", assTitle=").append(assTitle);
        sb.append(", subDateTime=").append(subDateTime);
        sb.append('}');
        return sb.toString();
    }

}
