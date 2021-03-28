package xyz.walk8243.nogiprofile.web.model;

import java.util.List;

public class DiscographyDetail extends Discography {
	private List<Song> songs;

	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
}
