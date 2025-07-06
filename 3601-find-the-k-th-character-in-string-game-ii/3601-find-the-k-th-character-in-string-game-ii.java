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
        return helper(k, operations, operations.length - 1);
    }
}