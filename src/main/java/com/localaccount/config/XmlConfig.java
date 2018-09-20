package com.localaccount.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Profile(value= {"dev"})
@Configuration
@ImportResource
public class XmlConfig {

}
