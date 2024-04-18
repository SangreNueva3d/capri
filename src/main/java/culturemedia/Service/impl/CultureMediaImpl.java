package culturemedia.Service.impl;

import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.Service.CultureMediaService;
public class CultureMediaImpl implements CultureMediaService{
    private VideoRepository videoRepository;
    private ViewsRepository viewRepository;

    public CultureMediaImpl(VideoRepository videoRepository, ViewsRepository viewRepository) {
        this.videoRepository = videoRepository;
        this.viewRepository = viewRepository;
    }

    @Override
    public Video add(Video video) {
        Video videoAdd = videoRepository.save(video);
        return videoAdd;
    }

    @Override
    public View add(View view) {
        View viewAdd = viewRepository.save(view);
        return viewAdd;
    }

    @Override
    public List<Video> findAllVideos() {
        List<Video> videos = videoRepository.findAll();
        return videos;
    }
}