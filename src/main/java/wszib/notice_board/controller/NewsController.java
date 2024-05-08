package wszib.notice_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wszib.notice_board.model.News;
import wszib.notice_board.service.NewsService;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @PostMapping("/add")
    public News addNews(@RequestParam String description, @RequestParam String pdfPath) {
        return newsService.addNews(description, pdfPath);
    }
}
