package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.*;

@Repository
public interface TimeEntryRepository {

    Map inMemoryDb = new HashMap();
    int timeId = 0;
    public TimeEntry create(TimeEntry timeEntry) ;

    public TimeEntry find(long timeEntryId); ;

    public TimeEntry update(long id, TimeEntry timeEntry) ;

    public void delete(long id);

    public List<TimeEntry> list();
}
