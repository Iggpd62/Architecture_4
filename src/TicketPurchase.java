import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TicketPurchase {
    public static void main(String[] args) {
     
        Person person = new Person(1, "Петров Петр Петрович", 123456789L, 123456L, "petrov");

        // Покупка билета
        Ticket ticket = buyTicket(person, BigDecimal.valueOf(10.5), LocalDateTime.now(), 1, 2, false, 10, 123);

        // Вывод информации о билете
        System.out.println("Билет куплен:");
        System.out.println("Цена: " + ticket.getPrice());
        System.out.println("Дата: " + ticket.getDate());
        System.out.println("Начальная зона: " + ticket.getStartZone());
        System.out.println("Конечная зона: " + ticket.getFinishZone());
        System.out.println("Есть ли багаж: " + ticket.isLuggage());
        System.out.println("Место: " + ticket.getPlace());
        System.out.println("Номер маршрута: " + ticket.getRoadNumber());
    }

    public static Ticket buyTicket(Person person, BigDecimal price, LocalDateTime date, int startZone, int finishZone, boolean isLuggage, int place, int roadNumber) {

        Ticket ticket = new Ticket(price, date, startZone, finishZone, isLuggage, place, roadNumber);

        return ticket;
    }
}
