package org.banwarisaini.learnspringframework.itr3.sample.enterprise.flow.web;

import org.banwarisaini.learnspringframework.itr3.sample.enterprise.flow.business.BussinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//sending response in the right format JSON, XML, HTML
@RestController
public class Controller {

    @Autowired
    private BussinessService bussinessService;

    //"/sum" => 100
    @GetMapping("/sum")
    public long displaySum(){
        return bussinessService.calculateSum();
    }

}



