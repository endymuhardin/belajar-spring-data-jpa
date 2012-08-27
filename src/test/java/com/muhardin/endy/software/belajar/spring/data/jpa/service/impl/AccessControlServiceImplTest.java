package com.muhardin.endy.software.belajar.spring.data.jpa.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.muhardin.endy.software.belajar.spring.data.jpa.domain.User;
import com.muhardin.endy.software.belajar.spring.data.jpa.service.AccessControlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class AccessControlServiceImplTest {

	@Autowired private AccessControlService accessControlService;
	
	@Test
	public void testCrud() {
		User u = new User();
		u.setUsername("endy");
		u.setFullname("Endy Muhardin");
		
		accessControlService.save(u);
		
		assertNotNull(u.getId());
		
		User ux = accessControlService.findUserById(u.getId());
		assertEquals("endy", ux.getUsername());
		assertEquals("Endy Muhardin", ux.getFullname());
		
		assertTrue(accessControlService.countUser() == 1);
		
		accessControlService.delete(ux);
		
		assertNull(accessControlService.findUserById(ux.getId()));
	}

}
