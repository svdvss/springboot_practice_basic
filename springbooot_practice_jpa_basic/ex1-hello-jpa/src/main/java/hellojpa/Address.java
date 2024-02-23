package hellojpa;

import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;

@Embeddable
public class Address {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Address() {
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}