package xyz.walk8243.nogiprofile.web.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import xyz.walk8243.nogiprofile.web.model.Discography;
import xyz.walk8243.nogiprofile.web.model.DiscographyDetail;
import xyz.walk8243.nogiprofile.web.model.Song;
import xyz.walk8243.nogiprofile.web.model.SongDetail;

@Repository
public class NogizakaApiRepositoryCacheImpl implements NogizakaApiRepository {
	@Autowired
	NogizakaApiRepositoryImpl nogizakaApiRepository;

	@Cacheable(value = "getSong", key = "'song/' + #songId")
	public SongDetail getSong(Integer songId) {
		return nogizakaApiRepository.getSong(songId);
	}

	@Cacheable("getSongAll")
	public List<Song> getSongAll() {
		return nogizakaApiRepository.getSongAll();
	}

	@Cacheable(value = "getDiscography", key = "'disc/' + #discId")
	public DiscographyDetail getDiscography(Integer discId) {
		return nogizakaApiRepository.getDiscography(discId);
	}

	@Cacheable("getDiscographyAll")
	public List<Discography> getDiscographyAll() {
		return nogizakaApiRepository.getDiscographyAll();
	}
}
