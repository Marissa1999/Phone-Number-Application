//Programmer: Marissa Gonçalves
//Date: August 25, 2017
//Purpose: This program should turn a ten-digit phone number into a readable string, with the dash, parentheses and a space.

import java.util.Scanner;

public class PhoneNumber

{
	public static void main (String[] args)

    {
		Scanner keyboard = new Scanner(System.in);

        // allow the program to input a phone number;
		System.out.print ("Enter a 10-digit phone number:");
		long phonenumber = keyboard.nextLong();

        //determine the area code, prefix and line number from remainder/division calculations;
		int area_code = (int) (phonenumber / 10000000);
		System.out.println ("Area Code: " + area_code);

		long prefix = (phonenumber % 10000000 / 10000);
		System.out.println ("Prefix: " + prefix);

		long line_number = (phonenumber % 10000000 % 10000);
		System.out.println ("Line Number: " + line_number);

        // write a conclusion which indicates the final ouput, which the phone number has parentheses, a dash and space;
		System.out.println ("Phone Number: (" + area_code + ") " + (prefix) + - (line_number));

		System.out.println ();
    }

}