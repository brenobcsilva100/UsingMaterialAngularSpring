package com.example.iniciandospringangular.exceptions;

import java.io.File;
import java.io.Serializable;

public class StandartError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private Integer status;
    private String error;
    private File path;

    public StandartError() {
    }

    public StandartError(Long timestamp, Integer status, String error, File path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public StandartError(Long timestamp, Integer status, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public File getPath() {
        return path;
    }

    public void setPath(File path) {
        this.path = path;
    }
}
