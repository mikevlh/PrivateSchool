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
public class TrainerCourse {

    private int trainerId;
    private String trainerFName;
    private String trainerLName;
    private String trainerSubject;
    private int courseId;
    private String courseTitle;
    private String courseStream;
    private String courseType;
    private Date startDate;
    private Date endDate;

    public TrainerCourse() {
    }

    public TrainerCourse(int trainerId, String trainerFName, String trainerLName, String trainerSubject, int courseId, String courseTitle, String courseStream, String courseType, Date startDate, Date endDate) {
        this.trainerId = trainerId;
        this.trainerFName = trainerFName;
        this.trainerLName = trainerLName;
        this.trainerSubject = trainerSubject;
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseStream = courseStream;
        this.courseType = courseType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerFName() {
        return trainerFName;
    }

    public void setTrainerFName(String trainerFName) {
        this.trainerFName = trainerFName;
    }

    public String getTrainerLName() {
        return trainerLName;
    }

    public void setTrainerLName(String trainerLName) {
        this.trainerLName = trainerLName;
    }

    public String getTrainerSubject() {
        return trainerSubject;
    }

    public void setTrainerSubject(String trainerSubject) {
        this.trainerSubject = trainerSubject;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrainerCourse{trainerId=").append(trainerId);
        sb.append(", trainerFName=").append(trainerFName);
        sb.append(", trainerLName=").append(trainerLName);
        sb.append(", trainerSubject=").append(trainerSubject);
        sb.append(", courseId=").append(courseId);
        sb.append(", courseTitle=").append(courseTitle);
        sb.append(", courseStream=").append(courseStream);
        sb.append(", courseType=").append(courseType);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }

}
