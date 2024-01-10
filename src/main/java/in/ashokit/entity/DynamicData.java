package in.ashokit.entity;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "dynamicData")
@Data
public class DynamicData {

	@Id
	private String id;
	private Map<String, Object> fields;
}
