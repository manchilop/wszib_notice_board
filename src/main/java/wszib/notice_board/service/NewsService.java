package wszib.notice_board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wszib.notice_board.model.News;
import wszib.notice_board.repository.NewsRepository;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNews() {
        return newsRepository.findAll();
    }

    public News addNews(String description, String pdfPath) {
        News news = new News(description, pdfPath);
        return newsRepository.save(news);
    }
}
