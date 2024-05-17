package mSeva;

public class MSeva implements MedicalService {
    @Override
    public String identifyDisease(String[] symptoms) {
    	
    	String[] diseases = {"Acute pancreatitis", "Appendicitis", "Bladder Cancer", "Pancreatic Cancer"};
    	
    	String[][] diseaseSymptoms = {
    		{"Stomach ache", "vomiting", "low eye sight", "Muscle ache", "fever"},
    		{"Stomach ache", "vomiting", "low eye sight", "fatigue", "fever"},
    		{"Stomach ache", "vomiting", "low eye sight", "skin allergy", "low bp"},
    		{"Stomach ache", "vomiting", "low eye sight", "fatigue", "fever"}
    	};
    	
    	StringBuilder result = new StringBuilder("Identified Diseases: ");
    	
    	for(int i=0; i<diseases.length; i++) {
    	    boolean allSymptoms = true;
    	    
    	    for(String symptom : symptoms) {
    	    	if(!contains(diseaseSymptoms[i], symptom)) {
    	    	    allSymptoms = false;
    	    	    break;
    	    	}
    	    }
    	    
    	    if(allSymptoms) {
    	    	result.append(diseases[i]).append(", ");
    	    }
    	}
    	
    	if(result.length() > 0) {
    	    result.setLength(result.length() - 2);
    	} else {
    	    result.append("No diseases identified");
    	}
    	
    	return result.toString();
    }
    
    private boolean contains(String[] disease, String target) {
    	for(String sym : disease) {
    	    if(sym.equalsIgnoreCase(target)) 
    	    	return true;
    	}
    	
    	return false;
    }

}
