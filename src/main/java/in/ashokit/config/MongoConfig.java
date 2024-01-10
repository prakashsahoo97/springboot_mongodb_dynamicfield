/*
 * package in.ashokit.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.data.mongodb.core.MongoTemplate;
 * 
 * @Configuration public class MongoConfig {
 * 
 * @Bean public MongoDbFactory mongoDbFactory() { return new
 * SimpleMongoClientDbFactory("mongodb://localhost:27017/your_database_name"); }
 * 
 * @Bean public MongoTemplate mongoTemplate() { return new
 * MongoTemplate(mongoDbFactory()); } }
 */