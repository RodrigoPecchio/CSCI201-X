package com.usc.csci201x;

public class Main {

	public static void main(String[] args) {
		SQL_Util.initConnection();
		SQL_Util.addUser("geoff", "director123");
		SQL_Util.addUser("headCP", "badpassword");
		SQL_Util.addVehicle("2016 Mercedes-Benz C43 AMG 3.0L V6 Biturbo");
		SQL_Util.addVehicle("2016 Maserati Ghibli S 3.0L V6 Biturbo");
		int uid = SQL_Util.getUID("headCP");
		int vid = SQL_Util.getVID("2016 Maserati Ghibli S 3.0L V6 Biturbo");
		SQL_Util.addVehicleToUser(uid, vid, "Black");
		System.out.println("Done :)");
	}

}
