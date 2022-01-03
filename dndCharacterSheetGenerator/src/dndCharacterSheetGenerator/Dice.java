package dndCharacterSheetGenerator;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	
	private int d20max = 20;
	private int d12max = 12;
	private int d10max = 10;
	private int d8max = 8;;
	private int d4max = 4;
	private int min = 1;
	
	
	private int rollD20() {
		Random random = new Random();
		int roll = random.nextInt(d20max - min) + min;
		return roll;
	}
	
	private int rollD12() {
		Random random = new Random();
		int roll = random.nextInt(d12max - min) + min;
		return roll;
	}
	
	private int rollD10() {
		Random random = new Random();
		int roll = random.nextInt(d10max - min) + min;
		return roll;
	}
	
	private int rollD8() {
		Random random = new Random();
		int roll = random.nextInt(d8max - min) + min;
		return roll;
	}
	
	private int rollD4() {
		Random random = new Random();
		int roll = random.nextInt(d4max - min) + min;
		return roll;
	}
	

}
