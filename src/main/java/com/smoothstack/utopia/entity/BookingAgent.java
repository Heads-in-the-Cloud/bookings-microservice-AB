package com.smoothstack.utopia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "booking_agent")
public class BookingAgent {
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @Column(name = "agent_id")
    private Integer agentId;

    public Booking getBooking() {
        return booking;
    }
    public void setBooking(final Booking booking) {
        this.booking = booking;
    }
    public Integer getAgentId() {
        return agentId;
    }
    public void setAgentId(final Integer agentId) {
        this.agentId = agentId;
    }
}
