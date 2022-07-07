
package enterprise.repositories;

import enterprise.models.Category;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

    List<Category> findAll();
    Category findByName(String categoryName);
    boolean existsByName(String categoryName);
}
