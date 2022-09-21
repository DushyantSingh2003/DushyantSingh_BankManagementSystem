package com.dushyantsingh.service;

public class OtpGenerator {

	public static int generateOtp() // utility medthods usually made static
	{
		int otp = (int)(Math.random()*9000)+1000;
		return otp;
	}
	
}
