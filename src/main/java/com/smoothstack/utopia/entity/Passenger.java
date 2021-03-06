package com.smoothstack.utopia.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    @NotNull
    @Size(max = 255)
    @Column(name = "given_name")
    private String givenName;

    @NotNull
    @Size(max = 255)
    @Column(name = "family_name")
    private String familyName;

    @NotNull
    @Column(name = "dob")
    private Timestamp dateOfBirth;

    @NotNull
    @Size(max = 45)
    private String gender;

    @NotNull
    @Size(max = 45)
    private String address;

    public Integer getId() {
        return id;
    }
    public void setId(final Integer id) {
        this.id = id;
    }
    public Booking getBooking() {
        return booking;
    }
    public void setBooking(final Booking booking) {
        this.booking = booking;
    }
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(final String givenName) {
        this.givenName = givenName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(final String familyName) {
        this.familyName = familyName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(final String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(final String address) {
        this.address = address;
    }
}
