/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dani_
 */
public class Reservation {
    
    private int reservnId;
    private int roomNumber;
    private int numPerson;
    private String reservDate;

    public Reservation() {
    }

    public Reservation(int reservnId, int roomNumber, int numPerson, String reservDate) {
        this.reservnId = reservnId;
        this.roomNumber = roomNumber;
        this.numPerson = numPerson;
        this.reservDate = reservDate;
    }

    public int getReservnId() {
        return reservnId;
    }

    public void setReservnId(int reservnId) {
        this.reservnId = reservnId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }

    public String getReservDate() {
        return reservDate;
    }

    public void setReservDate(String reservDate) {
        this.reservDate = reservDate;
    }
    
    
    
            
}
