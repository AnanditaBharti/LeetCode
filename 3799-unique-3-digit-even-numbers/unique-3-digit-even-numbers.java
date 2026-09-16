class Solution {
    public int totalNumbers(int[] digits) {

        int[] digFreq = new int[10];
        for(int i: digits){
            digFreq[i] ++;
        }

        int count = 0;
        for(int i = 1; i < 10; i ++){
            if(digFreq[i] == 0){
                continue;
            }

            for(int j = 0; j < 10; j ++){
                if(digFreq[j] == 0){
                    continue;
                }

                for(int k = 0; k <= 8; k += 2){
                    if(digFreq[k] == 0){
                        continue;
                    }
                    if(k == j && j == i){
                        if(digFreq[i] < 3)
                            continue;
                    }
                    if(k == j && digFreq[j] < 2)
                        continue;
                    if(i == j && digFreq[j] < 2)
                        continue;
                    if(k == i && digFreq[k] < 2)
                        continue;
                    count ++;
                }
            }
        }

        return count;
    }
}