package forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(001, "john", 'm', LocalDate.of(1991, 10, 10), 13));
        theUsersList.add(new ForumUser(002, "jack", 'm', LocalDate.of(1999, 11, 1), 6));
        theUsersList.add(new ForumUser(003, "jimmy", 'm', LocalDate.of(2003, 10, 10), 0));
        theUsersList.add(new ForumUser(004, "jenny", 'f', LocalDate.of(1982, 1, 10), 0));
        theUsersList.add(new ForumUser(005, "jake", 'm', LocalDate.of(1984, 10, 10), 1));
        theUsersList.add(new ForumUser(006, "jasiu", 'm', LocalDate.of(1989, 1, 1), 0));
        theUsersList.add(new ForumUser(007, "jodie", 'f', LocalDate.of(1991, 4, 3), 11));
    }

    public List<ForumUser> getUsersList(){
        return new ArrayList<>(theUsersList);
    }
}
