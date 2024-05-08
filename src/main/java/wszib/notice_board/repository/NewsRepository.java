package wszib.notice_board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wszib.notice_board.model.News;

public interface NewsRepository extends JpaRepository<News, Long> {
    // Add here custom query methods.
}
