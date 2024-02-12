package AirLines;

import java.time.LocalTime;
import java.util.Objects;

public class Flight {
    private String departurePoint;
    private LocalTime departureTime;
    private String arrivalPoint;
    private LocalTime arrivalTime;

    public Flight(String departurePoint, LocalTime departureTime, String arrivalPoint, LocalTime arrivalTime) {
        this.departurePoint = departurePoint;
        this.departureTime = departureTime;
        this.arrivalPoint = arrivalPoint;
        this.arrivalTime = arrivalTime;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(departurePoint, flight.departurePoint))
            return false;
        if (!Objects.equals(departureTime, flight.departureTime))
            return false;
        if (!Objects.equals(arrivalPoint, flight.arrivalPoint))
            return false;
        return Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        int result = departurePoint != null ? departurePoint.hashCode() : 0;
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (arrivalPoint != null ? arrivalPoint.hashCode() : 0);
        result = 31 * result + (arrivalTime != null ? arrivalTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return
                "From " + departurePoint + " " +
                departureTime +
                " to " + arrivalPoint + " " +
                 arrivalTime;
    }
}
