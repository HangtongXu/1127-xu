package com.domain;

import java.sql.Timestamp;

public class Video {

    private String v_name;
    private String v_url;
    private Timestamp v_date;
    private Integer v_id;

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public String getV_url() {
        return v_url;
    }

    public void setV_url(String v_url) {
        this.v_url = v_url;
    }

    public Timestamp getV_date() {
        return v_date;
    }

    public void setV_date(Timestamp v_date) {
        this.v_date = v_date;
    }

    public Integer getV_id() {
        return v_id;
    }

    public void setV_id(Integer v_id) {
        this.v_id = v_id;
    }

    @Override
    public String toString() {
        return "Video{" +
                "v_name='" + v_name + '\'' +
                ", v_url='" + v_url + '\'' +
                ", v_date=" + v_date +
                ", v_id=" + v_id +
                '}';
    }
}
