package net.temecom.ai.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Base controller for generating enumeration lists
 * Subclass and provide the getEnumerationValues method to have your enumeration available as a 
 * REST call 
 * @author csmith
 *
 * @param <T>
 */
@SuppressWarnings("rawtypes")
public abstract  class EnumerationController <T extends Enum>{

	public abstract T[] getEnumerationValues(); 
	
	/**
	 * Provide the list of enumeration values and ordinals
	 * @return the JSON-ized list of enumerations
	 */
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<Map<String, String>> getEnumerations() {
		List<Map<String, String>> enumerations = new ArrayList<>();
		
		for (T value: getEnumerationValues()) {
			HashMap<String, String> map = new HashMap<>();
			map.put("id", value.name());
			map.put("name", value.name());
			enumerations.add(map);
		}
		return enumerations; 
	}
	
}
