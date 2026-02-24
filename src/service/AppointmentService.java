package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("Java assignment");
        appointments.add("Python task 2");
        appointments.add("Check the signal router");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        appointments.removeLast();
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        System.out.println(appointments.getFirst());
        System.out.println(appointments.getLast());

    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> it = appointments.iterator();
        while(it.hasNext()) {
            String currentAppointments = it.next();
            System.out.println(currentAppointments);
        }

    }
}
