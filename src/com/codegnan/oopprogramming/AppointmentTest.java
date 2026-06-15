package com.codegnan.oopprogramming;

public class AppointmentTest {
	public static void main(String[] args) {
		Appointment appointment = new Appointment();
		appointment.schedule();
		DoctorAppointment doctorAppointment = new DoctorAppointment();
		doctorAppointment.schedule();
		DentistAppointment dentistAppointment = new DentistAppointment();
		dentistAppointment.schedule();
	}
}
