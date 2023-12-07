import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {
    private BigDecimal price;
    private LocalDateTime date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    public Ticket(BigDecimal price, LocalDateTime date, int startZone, int finishZone, boolean isLuggage, int place, int roadNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.roadNumber = roadNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getStartZone() {
        return startZone;
    }

    public int getFinishZone() {
        return finishZone;
    }

    public boolean isLuggage() {
        return isLuggage;
    }

    public int getPlace() {
        return place;
    }

    public int getRoadNumber() {
        return roadNumber;
    }
}
