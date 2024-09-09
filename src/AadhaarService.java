

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    static {
        aadhaarMap.put("1232332234",new Aadhaar("1232332234",
                "John","Stephens","Agra"));
        aadhaarMap.put("1232332236",new Aadhaar("1232332236",
                "Tomu","Tom Cruise","Delhi"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber)
    {
        return aadhaarMap.get(aadhaarNumber);
    }
}