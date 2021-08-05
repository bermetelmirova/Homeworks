package org.example;

public class Chess {
    String data;
    String bw;

    public Chess(String data, String bw) {
        this.data = data;
        this.bw = bw;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getBw() {
        return bw;
    }

    public void setBw(String bw) {
        this.bw = bw;
    }
}
