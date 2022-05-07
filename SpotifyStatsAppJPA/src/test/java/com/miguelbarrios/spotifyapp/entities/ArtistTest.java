package com.miguelbarrios.spotifyapp.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArtistTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Artist artist;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	    emf = Persistence.createEntityManagerFactory("SpotifyStatsAppJPA");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	    emf.close();
	}
	
	@BeforeEach
	void setUp() throws Exception {
	    em = emf.createEntityManager();
	    artist = em.find(Artist.class, "Drake");
	}

	@AfterEach
	void tearDown() throws Exception {
	    em.close();
	    artist = null;
	}

	@Test
	void test1() {
		assertNotNull(artist);
		
	}

}
