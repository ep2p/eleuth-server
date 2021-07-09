package io.ep2p.eleuthserver.config;

import io.ep2p.somnia.config.dynamic.EnableSomniaRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableSomniaRepository(basePackages = "io.ep2p.eleuthserver.database.repository")
@EnableMongoRepositories(basePackages = "io.ep2p.eleuthserver.database.repository")
public class DatabaseConfiguration {
}
