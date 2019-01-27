package com.st.order.controller;

import com.st.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClientController2 {

    @Autowired
    private ProductClient productClient;

    @GetMapping("getProductMsg2")
    public String getProductMsg() {

        String response = productClient.productMsg();
        return response;
    }
}
