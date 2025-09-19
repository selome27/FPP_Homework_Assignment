package LESSON9.problem4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    Queue<Ticket> queue = new LinkedList();

    public TicketingSystem() {
    }

    public void addTicket(String desc) {
        int ticketId = getTicketId();
        Ticket ticket = new Ticket(ticketId, desc);
        this.queue.add(ticket);
        System.out.println("Ticket Created : " + String.valueOf(ticket));
    }

    public Ticket processTicket() {
        Ticket removedTicket = (Ticket)this.queue.poll();
        System.out.println("Ticket processed: " + String.valueOf(removedTicket));
        return removedTicket;
    }

    public Ticket viewNextTicket() {
        Ticket nextTicket = (Ticket)this.queue.peek();
        System.out.println("Next in the queue is: " + String.valueOf(nextTicket));
        return nextTicket;
    }

    public void searchTicket(String details) {
        Iterator<Ticket> iterator = this.queue.iterator();
        boolean isFound = false;

        while(iterator.hasNext()) {
            if (((Ticket)iterator.next()).getDescription().equals(details)) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Ticket found for details " + details);
        } else {
            System.out.println("Ticket not found for details " + details);
        }

    }

    private static int getTicketId() {
        return (int)(Math.random() * 999999.0);
    }
}

