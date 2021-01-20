package com.jcreid.greetingsvc;

public class Greeting {

    private final long id;
    private final String content;
    private final long dummyID;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.dummyID = 1;
    }

    public long getId() {
        // test comment
        return id;
    }

    public String getContent() {
        return content;
    }
}
