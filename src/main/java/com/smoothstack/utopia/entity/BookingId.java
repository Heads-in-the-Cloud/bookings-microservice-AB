package com.smoothstack.utopia.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;

@Embeddable
public class BookingId implements Serializable {
    @NotNull
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    public Booking getBooking() {
        return booking;
    }
    public void setBooking(final Booking booking) {
        this.booking = booking;
    }
}
