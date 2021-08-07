package com.company.Model;

public class UserLog {
    private int id;
    private boolean isSuccess;
    private int user;

    public UserLog() {
    }

    public UserLog(int id, boolean isSuccess, int user) {
        this.id = id;
        this.isSuccess = isSuccess;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserLog{" +
                "id=" + id +
                ", isSuccess=" + isSuccess +
                ", user=" + user +
                '}' + "\n";
    }
}
