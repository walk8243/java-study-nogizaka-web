package xyz.walk8243.nogiprofile.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.walk8243.nogiprofile.web.model.Song;
import xyz.walk8243.nogiprofile.web.model.SongDetail;
import xyz.walk8243.nogiprofile.web.repository.NogizakaApiRepositoryCacheImpl;

@Service
public class SongService extends BaseService {
	@Autowired
	NogizakaApiRepositoryCacheImpl nogizakaApiRepository;

	public List<Song> getAll() {
		List<Song> songs = nogizakaApiRepository.getSongAll();
		return songs;
	}

	public SongDetail get(Integer id) {
		SongDetail song = nogizakaApiRepository.getSong(id);
		return song;
	}
}
