package com.multipledbexample.multipledbexample;

import com.multipledbexample.multipledbexample.product.ProductRepository;
import com.multipledbexample.multipledbexample.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/poc/multiple-db")
public class Controller {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;
}
