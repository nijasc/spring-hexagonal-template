package com.example.api

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.servers.Server
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@ComponentScan(basePackages = ["com.example"])
@EnableConfigurationProperties
@EnableJpaRepositories(basePackages = ["com.example.infrastructure.jpa"])
@EntityScan(basePackages = ["com.example.infrastructure.jpa"])
@EnableJpaAuditing
@OpenAPIDefinition(servers = [Server(url = "/api/v1", description = "Request from the current instance.")])
@EnableScheduling
@EnableAsync
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
