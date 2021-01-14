package com.cg.songplayer;

public class SongPlayer {
	public static void main(String[] args) {
		SongService songService = new SongService();
		songService.start();

	}
}
