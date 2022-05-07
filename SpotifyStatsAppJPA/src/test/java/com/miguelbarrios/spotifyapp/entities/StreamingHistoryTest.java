package com.miguelbarrios.spotifyapp.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StreamingHistoryTest {


	private static EntityManagerFactory emf;
	private EntityManager em;
	private StreamingHistory record;
	
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
	    record = em.find(StreamingHistory.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
	    em.close();
	    record = null;
	}

	@Test
	@DisplayName("Test Basic mapping")
	void basic_mapping_test() {
		assertNotNull(record);
		assertEquals("I Took A Pill In Ibiza - Seeb Remix", record.getTrackName());
		assertEquals(128912, record.getMsPlayed());
	}
	
	@Test
	@DisplayName("Test OTM mapping to Artist")
	void test_relationship_to_artist() {
		assertNotNull(record);
		assertEquals("Mike Posner", record.getArtist().getArtistName());
	}
	
	@Test
	@DisplayName("Test OTM mapping to User")
	void test_relationship_to_user() {
		assertNotNull(record);
		assertEquals("lochnessbarrios", record.getUser().getUsername());
	}

}
