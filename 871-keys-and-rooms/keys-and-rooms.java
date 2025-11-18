class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] roomUnlocked = new boolean[n];
        roomUnlocked[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            List<Integer> keys = rooms.get(queue.remove());
            for(int k: keys){
                if(!roomUnlocked[k]){
                    roomUnlocked[k] = true;
                    queue.add(k);
                }
            }
        }
        // for(int i = 0; i < rooms.size(); i++){
        //     List<Integer> keys = rooms.get(i);
        //     for(int j = 0; j < keys.size(); j++){
        //         int key = keys.get(k);
        //         if(i != j)
        //     }
        // }
        // roomUnlocked[0] = true;
        for(boolean check: roomUnlocked){
            if(!check)
                return false;
        }
        return true;
    }
}