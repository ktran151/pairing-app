package org.wecancodeit.pairing;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class PairedMapRepoTest {
	PairedMapRepo underTest = new PairedMapRepo();

	@Test
	public void shouldGenerateRandomPairs() {
		Student testStudent1 = new Student(14, "Kevin");
		Student testStudent2 = new Student(13, "Jane");

		underTest.add(testStudent1, testStudent2);
		Student result = underTest.getStudent(testStudent1);

		Assert.assertEquals(testStudent2, result);
	}

	@Test
	public void shouldGenerateRandomNumber() {
		int result = underTest.getRandomNumber();
		assertTrue((result >= 1) && (result <= 14));
	}
}
