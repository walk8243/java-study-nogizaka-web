package xyz.walk8243.nogiprofile.web.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class DiscographyDetail extends Discography {
	@Getter @Setter List<SongOnDisc> songs;

	static class SongOnDisc extends Song {
		@Getter @Setter Integer order;
	}
}
