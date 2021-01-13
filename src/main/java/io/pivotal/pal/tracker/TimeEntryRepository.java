package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.*;

@Repository
public class TimeEntryRepository {

    Map inMemoryDb = new HashMap();
    int timeId = 0;
    public TimeEntry create(TimeEntry timeEntry) {
        long id = ++timeId;
        timeEntry.setId(id);
        inMemoryDb.put(id, timeEntry);;
        return timeEntry;
    }

    public TimeEntry find(long timeEntryId) {
        return (TimeEntry)inMemoryDb.get(timeEntryId);
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        if(inMemoryDb.get(id)==null) return  null;
        timeEntry.setId(id);
        inMemoryDb.put(id, timeEntry);
        return timeEntry;
    }

    public void delete(long id) {
        inMemoryDb.remove(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList(inMemoryDb.values());
    }
}
