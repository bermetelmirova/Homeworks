package com.company;

public class UsbPort {
    private String portType;
    private String PortID;

    public UsbPort() {
    }

    public UsbPort(String portType, String portID) {
        this.portType = portType;
        PortID = portID;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public void setPortID(String portID) {
        PortID = portID;
    }

    public String getPortID() {
        return PortID;
    }
}
