package in.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.entity.DynamicData;
import in.ashokit.entity.repo.DynamicDataRepository;

@Service
public class DynamicDataService {

	@Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private DynamicDataRepository dynamicDataRepository;

	public String saveDynamicData(String json) throws Exception {
		// Step 1: Deserialize JSON data into DynamicData
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, Object> dataMap = objectMapper.readValue(json, Map.class);
		DynamicData dynamicData = new DynamicData();
		dynamicData.setFields(dataMap);

		// Step 2: Save DynamicData into MongoDB
		//mongoTemplate.save(dynamicData, "dynamicData");
		dynamicDataRepository.save(dynamicData);
		return "data saved successfully";
	}
}
