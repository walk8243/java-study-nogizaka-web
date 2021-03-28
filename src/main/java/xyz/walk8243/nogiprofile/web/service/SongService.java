package xyz.walk8243.nogiprofile.web.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import xyz.walk8243.nogiprofile.web.model.Song;
import xyz.walk8243.nogiprofile.web.model.SongDetail;

@Service
public class SongService extends BaseService {
	public static final String BASE_PATH = "/song";

	public List<Song> getAll() {
		Song[] songs = restTemplate.getForObject(BASE_URL + BASE_PATH + "/all", Song[].class);
		return Arrays.asList(songs);
	}

	public SongDetail get(Integer id) {
		SongDetail song = restTemplate.getForObject(BASE_URL + BASE_PATH + "/discs/" + id.toString(), SongDetail.class);
		return song;
	}
}
