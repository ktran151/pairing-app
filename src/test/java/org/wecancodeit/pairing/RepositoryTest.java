package org.wecancodeit.pairing;

import org.junit.Test;

import junit.framework.Assert;

public class RepositoryTest {

	@Test
	public void shouldHoldStudents() {
		// Arrange
		StudentRepository underTest = new StudentRepository();
		// act
		// assert
		Student result = underTest.getStudentById(4);
		Assert.assertEquals(4, result.getId());
	}
}
