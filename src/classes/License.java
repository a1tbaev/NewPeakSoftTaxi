package classes;

import java.time.LocalDate;

public class License {
   private Long id;
   private LocalDate dateOfIssue;
  private LocalDate expirationDate;

    public License(Long id, LocalDate dateOfIssue, LocalDate expirationDate) {
        this.id = id;
        this.dateOfIssue = dateOfIssue;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate  = expirationDate;
    }

    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", dateOfIssue=" + dateOfIssue +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
