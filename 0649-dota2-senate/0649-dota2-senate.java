class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R'){
                radiant.add(i);
            }
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
        // ArrayList<Character> arr = new ArrayList<>();
        // for(char c : senate.toCharArray()){
        //     arr.add(c);
        // }
        // // arr.stream().forEach(System.out::print);
        // // System.out.println();
        // int i = 0; 
        // while(true){
        //     // System.out.println("i -> " + i);
        //     // arr.stream().forEach(System.out::print);
        //     // System.out.println();
        //     if(arr.get(i) == 'R'){
        //         if(arr.contains('D')){
        //             int index = arr.subList(i, arr.size()).indexOf('D');
        //             if(index != -1)
        //                index += i;
        //             else
        //                index = arr.indexOf('D');
        //             arr.remove(index);
        //             if(index > i)
        //                i++;
        //         }
        //         else{
        //             return "Radiant";
        //         }
        //     }
        //     else{
        //         if(arr.contains('R')){
        //             int index = arr.subList(i, arr.size()).indexOf('R');
        //             if(index != -1)
        //                index += i;
        //             else
        //                index = arr.indexOf('R');
        //             arr.remove(index);
        //             if(index > i)
        //                i++;
        //         }
        //         else{
        //             return "Dire";
        //         }
        //     }
        //     if(i >= arr.size()){
        //         i = 0;
        //     }
        // }
        // return null;
    }
}