package com.fast.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("my") //application.properties안에 my.name이 있기 때문에 my를 넣어줌
//@Configuration
// 메인에 @ConfigurationPropertiesScan을
// 이용해서 현재 클래스 @Configuration 없이도 스캔 가능하게 만듬.

public class MyProperties {

    private final String name;

    public MyProperties(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
