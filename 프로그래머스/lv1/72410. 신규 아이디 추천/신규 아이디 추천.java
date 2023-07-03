import java.util.*;

class Solution {
    public String solution(String new_id) {
        new_id = step1(new_id);
        // System.out.println(new_id);
        
        new_id = step2(new_id);
        // System.out.println(new_id);
        
        new_id = step3(new_id);
        // System.out.println(new_id);
        
        new_id = step4(new_id);
        // System.out.println(new_id);
        
        new_id = step5(new_id);
        // System.out.println(new_id);
        
        new_id = step6(new_id);
        // System.out.println(new_id);
        
        new_id = step7(new_id);
        // System.out.println(new_id);
        
        new_id = step4(new_id);

        
        return new_id;
    }
    
    private String step1(String new_id) {
        return new_id.toLowerCase();
    }
    
    private String step2(String new_id) {
        return new_id.replaceAll("[^a-z0-9-_.]", "");
    }
    
    private String step3(String new_id) {
        if(new_id.length() < 2) {
            return new_id;
        }
        
        String dot = "";
        
        for (int i=0; i<new_id.length(); i++) {
            dot += ".";
        }
        
        System.out.println(dot);
        
        while (dot.length()>=2) {
            new_id = new_id.replace(dot, ".");
            dot = dot.substring(1);
        }
        
        return new_id;
    }
    
    private String step4(String new_id) {
        if(new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        
        if(new_id.length() != 0 && new_id.charAt(new_id.length()-1) == '.') {
            new_id = new_id.substring(0, new_id.length()-1);
        }
        
        return new_id;
    }
    
    private String step5(String new_id) {
        if(new_id.equals("")) {
            new_id += "a";
        }
        
        return new_id;
    }
    
    private String step6(String new_id) {
        if(new_id.length()>=16) {
            new_id = new_id.substring(0, 15);
        }
        
        return new_id;
    }
    
    private String step7(String new_id) {
        if(new_id.length()<=2) {
            while(new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length()-1)+"";
            }
        }
        
        return new_id;
    }
}