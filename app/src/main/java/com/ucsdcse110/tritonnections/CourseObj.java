package com.ucsdcse110.tritonnections;

class CourseObj {
    public enum MeetingType {
        LE, DI, LA, RE, FI, SE, TU
    }

    public enum DayOfWeek {
        M, Tu, W, Th, F, S, Su
    }

    public final String department;
    public final String courseCode;
    public final String courseName;
    public final String sixDigitSectionID;
    public final MeetingType type;
    public final String sectionID;
    public final DayOfWeek[] dayOfWeek;
    public final String startTime;
    public final String endTime;
    public final String location;
    public final String instructor;
    public final int seatsAvailable;
    public final int seatsLimit;
    private String capeGPA;

    public CourseObj(String department, String courseCode, String courseName, String sixDigitSectionID, MeetingType type, String sectionID, DayOfWeek[] dayOfWeek, String startTime, String endTime, String location, String instructor, int seatsAvailable, int seatsLimit) {
        this.department = department;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.sixDigitSectionID = sixDigitSectionID;
        this.type = type;
        this.sectionID = sectionID;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
        this.instructor = instructor;
        this.seatsAvailable = seatsAvailable;
        this.seatsLimit = seatsLimit;
    }

    public void setCapeGPA(String s) {
        capeGPA = s;
    }

    public String getCapeGPA() {
        return capeGPA;
    }
}