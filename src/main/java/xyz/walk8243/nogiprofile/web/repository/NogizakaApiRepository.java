package xyz.walk8243.nogiprofile.web.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import xyz.walk8243.nogiprofile.web.AppProperties;
import xyz.walk8243.nogiprofile.web.model.Discography;
import xyz.walk8243.nogiprofile.web.model.DiscographyDetail;
import xyz.walk8243.nogiprofile.web.model.Song;
import xyz.walk8243.nogiprofile.web.model.SongDetail;

@Repository
public class NogizakaApiRepository {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	AppProperties appProperties;

	public SongDetail getSong(Integer songId) {
		SongDetail song = restTemplate.getForObject(getBaseUrl() + "/song/discs/" + songId.toString(), SongDetail.class);
		return song;
	}

	public List<Song> getSongAll() {
		Song[] songs = restTemplate.getForObject(getBaseUrl() + "/song/all", Song[].class);
		return Arrays.asList(songs);
	}

	public DiscographyDetail getDiscography(Integer discId) {
		DiscographyDetail disc = restTemplate.getForObject(getBaseUrl() + "/disc/songs/" + discId.toString(), DiscographyDetail.class);
		return disc;
	}

	public List<Discography> getDiscographyAll() {
		Discography[] discs = restTemplate.getForObject(getBaseUrl() + "/disc/all", Discography[].class);
		return Arrays.asList(discs);
	}

	private String getBaseUrl() {
		return appProperties.getBackend().getUrl();
	}
}
