package com.example.firebasecrud;

public class MyModel {

    String sname;
    String smail;
    String spass;
    String sphone;
    String scollege;
    String sbranch;
    String sgender;
    String stech;
    String saddress;


    public MyModel(String sname, String smail, String spass, String sphone, String scollege, String sbranch, String sgender, String stech, String saddress) {
        this.sname = sname;
        this.smail = smail;
        this.spass = spass;
        this.sphone = sphone;
        this.scollege = scollege;
        this.sbranch = sbranch;
        this.sgender = sgender;
        this.stech = stech;
        this.saddress = saddress;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSmail() {
        return smail;
    }

    public void setSmail(String smail) {
        this.smail = smail;
    }

    public String getSpass() {
        return spass;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getScollege() {
        return scollege;
    }

    public void setScollege(String scollege) {
        this.scollege = scollege;
    }

    public String getSbranch() {
        return sbranch;
    }

    public void setSbranch(String sbranch) {
        this.sbranch = sbranch;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getStech() {
        return stech;
    }

    public void setStech(String stech) {
        this.stech = stech;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }
}
