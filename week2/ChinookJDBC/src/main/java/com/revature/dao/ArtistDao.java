package com.revature.dao;

import java.util.ArrayList;

import com.revature.models.Artist;

// The DAO is something we will cover in depth on Thursday when we
// connect to our databases
public interface ArtistDao {
	
	// This is where we store method stubs that perform operations
	// on our database
	
	// These are called CRUD (create, read, update, delete)
	public ArrayList<Artist> getAllArtists();
	public Artist getArtistById(int id);
	

}
