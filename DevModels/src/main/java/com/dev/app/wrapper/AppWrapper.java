package com.dev.app.wrapper;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;
import com.dev.app.model.User;

@JacksonXmlRootElement(localName = "users")
public class AppWrapper {

    @JacksonXmlElementWrapper(useWrapping = false) // avoids extra <list> tag
    private List<User> user;

    public AppWrapper() {}

    public AppWrapper(List<User> user) {
        this.user = user;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }
}
