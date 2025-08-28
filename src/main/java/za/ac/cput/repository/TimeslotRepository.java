//package za.ac.cput.repository;
//
//import za.ac.cput.domain.Timeslot;
//import za.ac.cput.factory.TimeslotFactory;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class TimeslotRepository extends TimeslotFactory {
//
//
//    //create object, read, delete
//    private Set<Timeslot> timeslotDB;
//
//    TimeslotRepository() {
//        timeslotDB = new HashSet<>();
//    }
//    public Timeslot create(Timeslot timeSlotId) {
//        this.timeslotDB.add(timeSlotId);
//        return timeSlotId;
//
//
//    }
//    public Timeslot read(String timeSlotId) {
//        Timeslot timeslot = this.timeslotDB.stream()
//                .filter(g->g.getTimeSlotId().equalsIgnoreCase(timeSlotId))
//                .findAny()
//                .orElse(null);
//        return timeslot;
//
//    }
//
//}
//
