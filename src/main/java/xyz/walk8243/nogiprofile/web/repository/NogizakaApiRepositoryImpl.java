package xyz.walk8243.nogiprofile.web.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;
import xyz.walk8243.nogiprofile.web.AppProperties;
import xyz.walk8243.nogiprofile.web.model.Discography;
import xyz.walk8243.nogiprofile.web.model.DiscographyDetail;
import xyz.walk8243.nogiprofile.web.model.Song;
import xyz.walk8243.nogiprofile.web.model.SongDetail;

@Repository
public class NogizakaApiRepositoryImpl implements NogizakaApiRepository {
	private RestTemplate restTemplate;
	@Getter private String baseUrl;

	public NogizakaApiRepositoryImpl(
		RestTemplate restTemplate,
		AppProperties appProperties
	) {
		this.restTemplate = restTemplate;
		this.baseUrl = appProperties.getBackend().getUrl();
	}

	public SongDetail getSong(Integer songId) {
		SongDetail song = restTemplate.getForObject(baseUrl + "/song/discs/" + songId.toString(), SongDetail.class);
		return song;
	}

	public List<Song> getSongAll() {
		Song[] songs = restTemplate.getForObject(baseUrl + "/song/all", Song[].class);
		return Arrays.asList(songs);
	}

	public DiscographyDetail getDiscography(Integer discId) {
		DiscographyDetail disc = restTemplate.getForObject(baseUrl + "/disc/songs/" + discId.toString(), DiscographyDetail.class);
		return disc;
	}

	public List<Discography> getDiscographyAll() {
		Discography[] discs = restTemplate.getForObject(baseUrl + "/disc/all", Discography[].class);
		return Arrays.asList(discs);
	}
}
