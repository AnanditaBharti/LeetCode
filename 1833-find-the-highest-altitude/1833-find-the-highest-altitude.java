class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for( int currentGain : gain){
            currentAltitude += currentGain ;
            if( currentAltitude > maxAltitude ){
                maxAltitude = currentAltitude ;
            }
        }
        return maxAltitude ;
    }
}