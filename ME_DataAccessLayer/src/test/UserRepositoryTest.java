package test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import repositories.UserRepository;

public class UserRepositoryTest {

	@Test
	public void testGetUserModel() {
		UserRepository userRepo = new UserRepository();
		assertNotNull("User Repository Nulo", userRepo.getUserModel("", ""));
	}

	@Test
	public void testGetUsersByUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsersByFullName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsersByFollower() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUsersByFollowing() {
		fail("Not yet implemented");
	}

}
