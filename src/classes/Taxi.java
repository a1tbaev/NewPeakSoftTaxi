package classes;

import enums.TaxiType;

import java.time.LocalDate;

public class Taxi {
    private Long id;
    private String model;
    private String number;
    private String colour;
    private LocalDate year;
    private TaxiType taxiType;

    public Taxi(Long id, String model, String number, String colour, LocalDate year, TaxiType taxiType) {
        this.id = id;
        this.model = model;
        this.number = number;
        this.colour = colour;
        this.year = year;
        this.taxiType = taxiType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public TaxiType getTaxiType() {
        return taxiType;
    }

    public void setTaxiType(TaxiType taxiType) {
        this.taxiType = taxiType;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", taxiType=" + taxiType +
                '}';
    }
}
