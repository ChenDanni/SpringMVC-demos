package com.dao;

import com.bean.Response;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseMapper {

    Response selectByMsg(@Param("msg") String msg);

}