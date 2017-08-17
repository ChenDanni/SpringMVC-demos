package com.realm;

import com.cache.CacheService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cdn on 17/8/15.
 */
public class UserRealm extends AuthorizingRealm{

    @Autowired
    CacheService cacheService;

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        String username = (String) principalCollection.getPrimaryPrincipal();

        if (username.equals("admin")){
            info.addRole("admin");
        }else if (username.equals("user")){
            info.addRole("user");
        }else {
            info.addRole("anon");
        }
        return info;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String name = (String) authenticationToken.getPrincipal();

        if (cacheService == null){
            System.out.println("err");
        }

        System.out.println("to find " + name + " from cache");
        //先去缓存查找
        String pwd = cacheService.getValue(name);
        if (pwd != null){
            System.out.println("get from cache");
            return new SimpleAuthenticationInfo(name,pwd,this.getName());
        }else {
            cacheService.cacheValue(name,"123",10);
            if (name.equals("admin"))
                return new SimpleAuthenticationInfo("admin","123",this.getName());
            else
                return new SimpleAuthenticationInfo("user","123",this.getName());
        }
    }
}
