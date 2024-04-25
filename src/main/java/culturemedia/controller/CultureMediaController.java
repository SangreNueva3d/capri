package culturemedia.controller;

import java.util.List;

import culturemedia.exception.VideoNotFoundException;
import culturemedia.model.Video;
import culturemedia.Service.CultureMediaService;

public class CultureMediaController {

	private final CultureMediaService cultureMediaService;

	public CultureMediaController(CultureMediaService cultureMediaService) {
		this.cultureMediaService = cultureMediaService;
	}

	public List<Video> findAllVideos() throws VideoNotFoundException {
		List<Video> videos = cultureMediaService.findAllVideos();
		return videos;
	}

}