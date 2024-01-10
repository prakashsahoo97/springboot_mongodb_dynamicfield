package in.ashokit.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.DynamicDataService;


@RestController
@RequestMapping("/api/dynamicData")
public class DynamicDataController {

	 @Autowired
	    private DynamicDataService dynamicDataService;

	    @PostMapping("/save")
	    public ResponseEntity<String> createDynamicData(@RequestBody String json) throws Exception {
	    	
	        return ResponseEntity.ok(dynamicDataService.saveDynamicData(json)) ;
	    }

		/*
		 * @GetMapping("/get") public List<DynamicData> getAllDynamicData() { return
		 * dynamicDataRepository.findAll(); }
		 */
}
