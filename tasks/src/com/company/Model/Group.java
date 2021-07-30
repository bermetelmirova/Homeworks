package com.company.Model;

public class Group {
    private int idGroup;
    private int faculty;
    private String groupCode;

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Group(int idGroup, int faculty, String groupCode) {
        this.idGroup = idGroup;
        this.faculty = faculty;
        this.groupCode = groupCode;
    }

    public Group() {
    }
}
