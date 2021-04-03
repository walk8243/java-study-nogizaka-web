package xyz.walk8243.nogiprofile.web.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class SongDetail extends Song {
	@Getter @Setter List<Discography> discographies;
}
