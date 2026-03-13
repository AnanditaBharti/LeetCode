class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int i: piles){
            maxSpeed = Math.max(maxSpeed, i);
        }
        int speed = maxSpeed;
        while(minSpeed <= maxSpeed){
            int midSpeed = (minSpeed + maxSpeed) / 2;
            long hours = 0;
            for(int i: piles){
                hours += (i + midSpeed - 1) / midSpeed;
            }
            if(hours <= h){
                speed = midSpeed;
                maxSpeed = midSpeed - 1;
            }
            else{
                minSpeed = midSpeed + 1;
            }
        }
        return speed;
    }
}