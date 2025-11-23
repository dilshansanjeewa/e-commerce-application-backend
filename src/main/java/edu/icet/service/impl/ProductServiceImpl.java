package edu.icet.service.impl;

import edu.icet.model.dto.ProductDto;
import edu.icet.model.entity.Product;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    ModelMapper mapper = new ModelMapper();
    @Override
    public void add(ProductDto productDto) {
        productRepository.save(mapper.map(productDto, Product.class));
    }

    @Override
    public List<ProductDto> getAll() {
        List<Product> all = productRepository.findAll();
        List<ProductDto> dtoList = new ArrayList<>();

        for(Product product : all){
            dtoList.add(mapper.map(product, ProductDto.class));
        }

        return dtoList;
    }
}
