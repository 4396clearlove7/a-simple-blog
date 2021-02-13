package com.yeriri.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class JwtToken implements AuthenticationToken {
    private String token;
    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }

    public JwtToken(String jwt){
        this.token = jwt;
    }
}
