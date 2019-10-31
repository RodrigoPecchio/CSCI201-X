package com.usc.csci201x.message;

import java.io.Serializable;
import java.util.Map;

public class Message implements Serializable {

    final String TEXT = "TEXT";
    private MessageType type;
    private String username;
    private Map<String, Object> data;

    public MessageType getMessageType() {
        return type;
    }

    public void setMessageType(MessageType type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getData(String K) {
        return data.get(K);
    }

    public void setData(String K, Object V) {
        data.put(K, V);
    }

    public void setText(String text) {
        data.put(TEXT, text);
    }

    public String getText() {
        return (String)data.get(TEXT);
    }
}
