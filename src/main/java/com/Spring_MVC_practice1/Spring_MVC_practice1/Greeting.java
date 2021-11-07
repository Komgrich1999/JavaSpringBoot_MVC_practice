package com.Spring_MVC_practice1.Spring_MVC_practice1;

public class Greeting {

    private final long id;
    private final String content;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
