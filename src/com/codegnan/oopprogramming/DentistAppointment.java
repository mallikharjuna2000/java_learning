package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DentistAppointment extends Appointment {
	public void schedule() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dental·procedure: ");
		String procedure = scanner.next();
		System.out.println("Dentist appointment scheduled for " + procedure);
	}
}
