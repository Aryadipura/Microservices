package ETS.productservice.repository;

import ETS.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ProductRepository extends MongoRepository<Product, String> {
}
