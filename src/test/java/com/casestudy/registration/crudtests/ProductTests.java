package com.casestudy.registration.crudtests;


import com.casestudy.registration.model.Products;
import com.casestudy.registration.repository.ProductsRepo;
import com.casestudy.registration.service.ProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTests {


    @Autowired
    private ProductsService productsService;
    @MockBean
    private ProductsRepo productsRepo;

    @Test
    public void getAllProductsTest() {
        when(productsRepo.findAll()).thenReturn(Stream.of(
                new Products(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc"),
                new Products(4,"Samsung Duos","Deal","sadhu","sshd"),
                new Products(5,"Samsung Duos2","Deal","sadhu","sshd")
        )
                .collect(Collectors.toList()));

        assertEquals(3,productsService.getAll().size());
    }

    @Test
    public void addProductsTest() {
        Products products = new Products(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc");
        when(productsRepo.insert(products)).thenReturn(products);
        assertEquals(products,productsService.addProducts(products));

    }

    @Test
    public void updateProductsTest() {
        Products products = new Products(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc");
        when(productsRepo.save(products)).thenReturn(products);
        assertEquals(products,productsService.updateProducts(products));

    }

    @Test
    public void deleteProductsTest() {
        Products products = new Products(3, "Samsung Edge", "Dealer", "ssadjhcb", "scbshdc");
        productsService.deleteProducts(3);
        verify(productsRepo,times(1)).deleteById(3);
    }
    @Test
    public void getProductTest() {
        Products products = new Products(4, "Samsung Edge", "Dealer", "ssadjhcb", "scbshdc");
        productsService.getProducts(4);
        verify(productsRepo,times(1)).findById(4);
    }
}

