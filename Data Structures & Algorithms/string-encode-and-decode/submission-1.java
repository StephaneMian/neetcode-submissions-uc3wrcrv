class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> L= new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int slash=str.indexOf("#",i);
            int longueur=Integer.parseInt(str.substring(i,slash));
            String a=str.substring(slash+1,slash+longueur+1);
            L.add(a);
            i=slash+longueur+1;
        }
        return L;
    }
}
