import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class frequencyCheck {
    public static ArrayList<Integer> maxFreq(int[] nums){
        int maxFreq = 0;

        //Creating arraylist to store multiple elements of same frequency
        ArrayList<Integer> answerKey = new ArrayList<>();  
        Map<Integer, Integer> freq = new HashMap<>();

        //Updation or insertion of element in map 
        for(int num : nums){
            if(!freq.containsKey(num)){
                freq.put(num, 1);
            }else{
                freq.put(num, freq.get(num)+1);
            }
           
        }

        //Updation of the value of maxFreq
        for(var e : freq.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq = e.getValue();
            }
        }

        //Accessing the keys 
        for(var key : freq.keySet()){
            if(freq.get(key) == maxFreq){
                answerKey.add(key);
            }
        }
        return answerKey;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,4,4,5,5,5};
        
        System.out.println(maxFreq(nums));
    }
}
