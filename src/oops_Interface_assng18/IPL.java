package oops_Interface_assng18;

public class IPL implements PCB,BCCI,AusCricket{

	@Override
	public void onlyRetiredPlayers() {
		System.out.println("--Aus Cricket--onlyRetiredPlayers");
		
	}

	@Override
	public void noTestPlayers() {
		System.out.println("--Aus Cricket--noTestPlayers");
		
	}

	@Override
	public void uncappedIndianPlayers() {
		System.out.println("--BCCI--uncappedIndianPlayers");
		
	}

	@Override
	public void cappedIndianPlayers() {
		System.out.println("--BCCI--cappedIndianPlayers");
		
	}

	@Override
	public void uncappedForeignPlayers() {
		System.out.println("--BCCI--uncappedForeignPlayers");
		
	}

	@Override
	public void cappedForeignPlayers() {
		System.out.println("--BCCI--cappedForeignPlayers");
		
	}

	@Override
	public void fastBowlers() {
		System.out.println("--PCB--fastBowlers");
		
	}

	@Override
	public void max10Players() {
		System.out.println("--PCB--max10Players");
		
	}

}
