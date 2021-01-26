package com.revature.models;

public class Artist {
	
	private int artistId;
	private String name;
	
	// with Models that specifiy objects
	// that can be persisted to a DB,
	// we ALWAYS include a no-args constructor
	// and a parameterized constructor
	
	/*
	 * A model class is simply intended to store data.  
	 * This particular model corresponds directly to the Artist table in our DB
	 * 
	 * We always include 2 constructors (a no-args and a parametierized).
	 * We provide getters, setters, and haschode() and equals() plus a toString() override.
	 */
	
	public Artist() {
		
	}

	public Artist(int artistId, String name) {
		super();
		this.artistId = artistId;
		this.name = name;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + artistId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		if (artistId != other.artistId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", name=" + name + "]";
	}
	
	
	

}
