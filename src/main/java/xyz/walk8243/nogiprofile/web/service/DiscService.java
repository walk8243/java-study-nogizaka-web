package xyz.walk8243.nogiprofile.web.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import xyz.walk8243.nogiprofile.web.model.Discography;
import xyz.walk8243.nogiprofile.web.model.DiscographyDetail;

@Service
public class DiscService extends BaseService {
	public static final String BASE_PATH = "/disc";

	public List<Discography> getAll() {
		Discography[] discs = restTemplate.getForObject(BASE_URL + BASE_PATH + "/all", Discography[].class);
		return Arrays.asList(discs);
	}

	public DiscographyDetail get(Integer id) {
		DiscographyDetail disc = restTemplate.getForObject(BASE_URL + BASE_PATH + "/songs/" + id.toString(), DiscographyDetail.class);
		return disc;
	}
}
