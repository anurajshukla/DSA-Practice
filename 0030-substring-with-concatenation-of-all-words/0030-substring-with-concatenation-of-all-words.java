class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s == null || s.length() == 0 || words == null || words.length == 0) 
            return Collections.emptyList();
        HashMap<String,Integer> map = new HashMap<>();           
        int len = words[0].length()*words.length;
        for(String str: words){ map.put(str,map.getOrDefault(str,0)+1); }
        List<Integer> list = new LinkedList<>();
        
        for(int i = 0;i<=s.length() - len;i++){
            HashMap<String,Integer> tempMap = new HashMap<>();    
            for(int j = 0;j<len;j += words[0].length()){ 
                String sub = s.substring(i+j,i+j+words[0].length());
                if(map.containsKey(sub)){
                    int count = tempMap.getOrDefault(sub,0);
                    tempMap.put(sub,count+1);
                }else continue;
            }
            if(map.equals(tempMap)) list.add(i);                    
        }
        return list;
    }
}