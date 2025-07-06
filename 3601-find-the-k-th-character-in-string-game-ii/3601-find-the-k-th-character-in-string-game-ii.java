class Solution {
    public char helper(long k, int[] operations, int operationNumber){
        if(operationNumber == -1){
            return 'a';
        }
        long currSize = (long) Math.pow(2, operationNumber + 1);
        long mid = currSize / 2;
        if(k <= mid){
            return helper(k, operations, operationNumber - 1);
        }
        else{
            if(operations[operationNumber] == 0){
                return helper(k - mid, operations, operationNumber - 1);
            }
            else{
                return (char) ((helper(k - mid, operations, operationNumber - 1) - 'a' + 1) % 26 + 'a');
            }
        }
    }
    public char kthCharacter(long k, int[] operations) {
        // long totalSizeOfOutput = Math.pow(2, operations.length - 1);
        return helper(k, operations, operations.length - 1);



        // StringBuilder z = new StringBuilder("a");
        // for(int i = 0; i < operations.length; i++){
        //     if(operations[i] == 0){
        //         z.append(z.toString());
        //     }
        //     else{
        //         StringBuilder temp = new StringBuilder();
        //         for(int j = 0; j < z.length(); j++){
        //             char c = z.charAt(j);
        //             if(c == 'z'){
        //                 temp.append("a");
        //             }
        //             else{
        //                 temp.append((char)(c + 1)); 
        //             }
        //         }
        //         z.append(temp);
        //     }
        //     if(z.length() >= k){
        //         return z.charAt((int)(k - 1));
        //     }
        // }
        // return z.charAt((int)(k - 1));
    }
}