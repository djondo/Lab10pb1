package com.company;

import java.util.Date;

/**
 * Created by rudi on 12/1/2015.
 */
public class TicketClass implements Comparable <TicketClass>{

    private int priority;
    private String reporter;
    private String description;
    private Date dateReported;
    private static int TicketIDCounter = 0;
    protected int TicketID;

    // get and set methods when needed
//    public int setTicketID(int newTicketID){
//        return TicketID = newTicketID;

    public int getTicketID(int newTicketID) {
        TicketID = newTicketID;
        return TicketID;
    }

    protected int getPriority() {
        return priority;
    }

    protected String getDescription() {
        return description;
    }

    public int compareTo(TicketClass ticketQueue){
        if (this.priority > ticketQueue.priority)
            return 1;
        else if(this.priority < ticketQueue.priority)
            return - 1;
        else
            return 0;
    }
    // constructor

    public TicketClass(int priority, String reporter, String description, Date dateReported, int staticTicketIDCounter) {
        this.priority = priority;
        this.reporter = reporter;
        this.description = description;
        this.dateReported = dateReported;
        this.TicketID = staticTicketIDCounter;
        staticTicketIDCounter++;
    }


    // method call for Ticket object (which can be an argument to System.println
    public String toString() {
        return (("ID = " + this.TicketID + " Issued: " + this.description + " Priority: " + this.priority + "-" + " Reported by: "
                + this.reporter + " on: " + this.dateReported));
    }
}

