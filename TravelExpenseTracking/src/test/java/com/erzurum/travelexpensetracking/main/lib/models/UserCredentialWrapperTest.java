package com.erzurum.travelexpensetracking.main.lib.models;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erzurum.travelexpensetracking.main.lib.models.UserCredentialWrapper;
import com.erzurum.travelexpensetracking.umple.UserCredential;

public class UserCredentialWrapperTest {

	@Test
    public void testParametricConstructor() {
        UserCredential userCredential = new UserCredential("testUsername", "testPassword", null);
        UserCredentialWrapper userCredentialWrapper;

        userCredentialWrapper = new UserCredentialWrapper(userCredential);

        assertNotNull(userCredentialWrapper);
    }
}
