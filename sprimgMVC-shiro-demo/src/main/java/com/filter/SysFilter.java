package com.filter;

import org.apache.shiro.web.filter.PathMatchingFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by cdn on 17/8/15.
 */
public class SysFilter extends PathMatchingFilter{

    public static int count = 0;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception{
        count++;
        System.out.println(count);
        return true;
    }

}
