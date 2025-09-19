class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R')
                radiant.add(i);
            else
                dire.add(i);
        }
        while(true){
            if(radiant.isEmpty())
                return "Dire";
            if(dire.isEmpty())
                return "Radiant";
            int r = radiant.remove();
            int d = dire.remove();
            if(r < d){
                radiant.add(n + r);
            }
            else
                dire.add(n + d);
        }
    }
}