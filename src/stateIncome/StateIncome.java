package stateIncome;

import java.util.HashMap;
import java.util.HashSet;

public class StateIncome {

    public HashMap<String, Double> getRepresentationPercentual(HashMap<String, Double> stateList){
        Double max = 0.0;
        HashMap<String, Double> percentages = new HashMap<>();
        for(String key : stateList.keySet()){
            max += stateList.get(key);
        }
        for(String key : stateList.keySet()){
            percentages.put(key, stateList.get(key) / max);
        }

        return percentages;

    }
}
