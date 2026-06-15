package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DoctorAppointment extends Appointment {
	public void schedule() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Specialization: ");
		String specialization = scanner.next();
		System.out.println("Doctor·appointment·scheduled·for " + specialization);
	}
}
