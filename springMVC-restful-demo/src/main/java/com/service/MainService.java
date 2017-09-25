package com.service;

import com.bean.Response;
import com.dao.ResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cdn on 2017/9/5.
 */
@Service
public class MainService {

    @Autowired
    ResponseMapper responseMapper;

    public String getMessage(String msg){

        Response response = responseMapper.selectByMsg(msg);
        if (response != null){
            return response.getResponse();
        }
        return "这个我不太清楚";
    }
}
