package xyz.walk8243.nogiprofile.web.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import xyz.walk8243.nogiprofile.web.model.Song;

@Service
public class SongService extends BaseService {
	@Autowired
	RestTemplate restTemplate;

	public static final String BASE_PATH = "/song";

	public List<Song> getAll() {
		Song[] songs = restTemplate.getForObject(BASE_URL + BASE_PATH + "/all", Song[].class);
		return Arrays.asList(songs);
	}
}
