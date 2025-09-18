class Solution {
    public String predictPartyVictory(String senate) {
        ArrayList<Character> arr = new ArrayList<>();
        for(char c : senate.toCharArray()){
            arr.add(c);
        }
        // arr.stream().forEach(System.out::print);
        // System.out.println();
        int i = 0; 
        while(true){
            // System.out.println("i -> " + i);
            // arr.stream().forEach(System.out::print);
            // System.out.println();
            if(arr.get(i) == 'R'){
                if(arr.contains('D')){
                    int index = arr.subList(i, arr.size()).indexOf('D');
                    if(index != -1)
                       index += i;
                    else
                       index = arr.indexOf('D');
                    arr.remove(index);
                    if(index > i)
                       i++;
                }
                else{
                    return "Radiant";
                }
            }
            else{
                if(arr.contains('R')){
                    int index = arr.subList(i, arr.size()).indexOf('R');
                    if(index != -1)
                       index += i;
                    else
                       index = arr.indexOf('R');
                    arr.remove(index);
                    if(index > i)
                       i++;
                }
                else{
                    return "Dire";
                }
            }
            if(i >= arr.size()){
                i = 0;
            }
        }
        // return null;
    }
}