package com.hexaware.movie_book.dto;

import java.time.LocalDateTime;

public class TicketDTO {
    private Long ticketId;
    private int showId;
    private int seatNumber;
    private double price;
    private LocalDateTime bookingTime;

    public TicketDTO() {
    }

    public TicketDTO(Long ticketId, int showId, int seatNumber, double price, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.showId = showId;
        this.seatNumber = seatNumber;
        this.price = price;
        this.bookingTime = bookingTime;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}
