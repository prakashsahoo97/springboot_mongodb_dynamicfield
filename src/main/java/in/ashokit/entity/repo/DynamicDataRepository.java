package in.ashokit.entity.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.ashokit.entity.DynamicData;

public interface DynamicDataRepository extends MongoRepository<DynamicData, String>{

}
