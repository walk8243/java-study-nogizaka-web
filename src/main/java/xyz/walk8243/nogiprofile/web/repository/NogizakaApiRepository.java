package xyz.walk8243.nogiprofile.web.repository;

import java.util.List;

import xyz.walk8243.nogiprofile.web.model.Discography;
import xyz.walk8243.nogiprofile.web.model.DiscographyDetail;
import xyz.walk8243.nogiprofile.web.model.Song;
import xyz.walk8243.nogiprofile.web.model.SongDetail;

public interface NogizakaApiRepository {
	public SongDetail getSong(Integer songId);
	public List<Song> getSongAll();
	public DiscographyDetail getDiscography(Integer discId);
	public List<Discography> getDiscographyAll();
}
