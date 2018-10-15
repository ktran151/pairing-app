package org.wecancodeit.pairing;

public class PairingUserApp {
	public static void main(String[] args) {

		int studentNbr = 1;
		int[] randomNumbersUsed;
		StudentRepository startingRepo = new StudentRepository();
		PairedMapRepo endingRepo = new PairedMapRepo();

		do {

			startingRepo.getStudentById(studentNbr);
			int nbr = getRandomNumber();
			endingRepo.add(studentNbr, endingRepo);
			studentNbr++;
		} while (studentNbr <= 14);

	}

	public static int getRandomNumber() {
		int x = (int) (Math.random() * ((14 - 1) + 1)) + 1;
		return x;
	}

}
