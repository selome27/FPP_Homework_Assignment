package LESSON9.problem4;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();
        system.addTicket("Flight FROM IOWA to CID");
        system.addTicket("Flight FROM IOWA to DES Moines");
        system.processTicket();
        system.processTicket();
        system.processTicket();
        system.addTicket("Flight FROM NY to ETH");
        system.viewNextTicket();
        system.searchTicket("Flight FROM NY to ETH");
        system.searchTicket("Flight FROM NY to NP");
    }
}

