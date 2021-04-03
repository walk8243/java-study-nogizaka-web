package xyz.walk8243.nogiprofile.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.walk8243.nogiprofile.web.model.Discography;
import xyz.walk8243.nogiprofile.web.model.DiscographyDetail;
import xyz.walk8243.nogiprofile.web.repository.NogizakaApiRepository;

@Service
public class DiscService extends BaseService {
	@Autowired
	NogizakaApiRepository nogizakaApiRepository;

	public List<Discography> getAll() {
		List<Discography> discs = nogizakaApiRepository.getDiscographyAll();
		return discs;
	}

	public DiscographyDetail get(Integer id) {
		DiscographyDetail disc = nogizakaApiRepository.getDiscography(id);
		return disc;
	}
}
