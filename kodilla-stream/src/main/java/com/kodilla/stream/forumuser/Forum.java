package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(12345, "Anna K.", 'K', 1995, 10, 11, 12));
        userList.add(new ForumUser(12356, "Michał W..", 'M', 1983, 1, 19, 0));
        userList.add(new ForumUser(12378, "Tomasz S.", 'M', 1989, 3, 12, 10));
        userList.add(new ForumUser(12396, "Monika T.", 'K', 2004, 10, 29, 9));
        userList.add(new ForumUser(12452, "Rafał T.", 'M', 2000, 5, 15, 7));
        userList.add(new ForumUser(12487, "Piotr D.", 'M', 1998, 8, 5, 4));
    }
    public List<ForumUser> getUserList() {return new ArrayList<>(userList);
    }
}
