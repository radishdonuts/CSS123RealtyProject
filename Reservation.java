/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibs;

/**
 *
 * @author Klowi
 */
public class Reservation extends Transaction {
    private double reservationFee;

    public Reservation(String client, String date, double reservationFee) {
        super(client, date);
        this.reservationFee = reservationFee;
    }

    public double getReservationFee() {
        return reservationFee;
    }

    public void setReservationFee(double reservationFee) {
        this.reservationFee = reservationFee;
    }
    
    @Override
    public double calculateTotal() {
        return reservationFee;
    }
}
