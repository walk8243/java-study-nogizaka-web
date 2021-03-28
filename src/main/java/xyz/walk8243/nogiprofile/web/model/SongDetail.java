package xyz.walk8243.nogiprofile.web.model;

import java.util.List;

public class SongDetail extends Song {
	private List<Discography> discographies;

	public List<Discography> getDiscographies() {
		return discographies;
	}
	public void setDiscographies(List<Discography> discographies) {
		this.discographies = discographies;
	}
}
