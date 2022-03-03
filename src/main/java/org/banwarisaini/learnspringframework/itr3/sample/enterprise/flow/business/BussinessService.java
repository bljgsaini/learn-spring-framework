package org.banwarisaini.learnspringframework.itr3.sample.enterprise.flow.business;

import org.banwarisaini.learnspringframework.itr3.sample.enterprise.flow.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//business logic
@Component
public class BussinessService{

    @Autowired
    private DataService dataService;

    public long calculateSum(){
        List<Integer> elements = dataService.retrieveData();
        return elements.stream().reduce(Integer::sum).get();
    }

}