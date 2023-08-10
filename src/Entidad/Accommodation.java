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
public class Accommodation {
    
     private int reservnId;
     private int numPerson;
     private int roomNumber;

    public Accommodation() {
    }

    public Accommodation(int reservnId, int numPerson, int roomNumber) {
        this.reservnId = reservnId;
        this.numPerson = numPerson;
        this.roomNumber = roomNumber;
    }

    public int getReservnId() {
        return reservnId;
    }

    public void setReservnId(int reservnId) {
        this.reservnId = reservnId;
    }

    public int getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
     
     
    
}
