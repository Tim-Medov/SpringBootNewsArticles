
package enterprise.repositories;

import enterprise.models.News;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface NewsRepository extends CrudRepository<News, Integer> {

    List<News> findAll();
    List<News> findByCategoryId(int id);
    List<News> findAllByTitleContaining(String query);
    List<News> findAllByTextContaining(String query);
    Optional<News> findById(Integer id);
}
