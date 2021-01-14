package com.cg.songplayer;

public class Song implements Comparable<Song>{
	private String title;
	private String artist;
	private String rating;
	private String year;

	public Song(String title, String artist, String rating, String year) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", rating=" + rating + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Song s) {

		return this.getTitle().compareTo(s.getTitle());
	}
	public int compareTo1(Song s) {

		return this.getYear().compareTo(s.getYear());
	}
	}
	

