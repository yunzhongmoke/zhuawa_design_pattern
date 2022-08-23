package com.w.pattern.responsibility;

/**
 * @author blue
 * @version 1.0
 */
public class LeaveRequest {

    private String name;
    private Integer number;
    private String content;

    public LeaveRequest(String name, Integer number, String content) {
        this.name = name;
        this.number = number;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }
}
