package xyz.walk8243.nogiprofile.web.model;

import java.util.List;

public class DiscographyDetail extends Discography {
	private List<SongOnDisc> songs;

	public List<SongOnDisc> getSongs() {
		return songs;
	}
	public void setSongs(List<SongOnDisc> songs) {
		this.songs = songs;
	}

	static class SongOnDisc extends Song {
		private Integer order;

		public Integer getOrder() {
			return order;
		}
		public void setOrder(Integer order) {
			this.order = order;
		}
	}
}
