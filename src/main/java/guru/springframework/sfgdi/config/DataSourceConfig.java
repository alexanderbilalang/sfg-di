package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.datasource.TempDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author alexander on 08/12/2022
 */
@PropertySource("classpath:datasource.yml")
@Configuration
public class DataSourceConfig {

    @Bean
    TempDataSource tempDataSource(@Value("${guru.username}") String username,
                                  @Value("${guru.password}") String password,
                                  @Value("${guru.jdbcUrl}") String jdbcUrl) {
        TempDataSource dataSource = new TempDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setJdbcUrl(jdbcUrl);
        return dataSource;
    }
}
