package org.banwarisaini.learnspringframework.itr3.sample.enterprise.flow.data;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//Getting Data
@Component
public class DataService{
    public List<Integer> retrieveData(){
        return Arrays.asList(12, 34, 56, 78, 90 );
    }
}