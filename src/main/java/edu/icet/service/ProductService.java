package edu.icet.service;

import edu.icet.model.dto.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductService {
    void add(ProductDto productDto);
    List<ProductDto> getAll();

}
