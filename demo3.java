package makne;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class demo3 {
		    public static void main(String[] args) {
		        String sentence = "The word count in Java using HashMap";		      	 
		        String[] words = sentence.trim().split("\\s+");		        		      
		        Map<String, Integer> wordCountMap = new HashMap<>();		        		        
		        for (String word : words) {
		            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
		        }		      		  
		        System.out.println("Word count in the sentence:");
		        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
		            System.out.println(entry.getKey() + " : " + entry.getValue());
		        }
		    }
		}


