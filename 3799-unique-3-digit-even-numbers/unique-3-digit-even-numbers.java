class Solution {
    // int factorial(int n){
    //     int product = 1;
    //     for(int i = 2; i <= n; i++){
    //         product *= i;
    //     }
    //     return product;
    // }
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
        
        // int n = digits.length;
        // int evenNumbers = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < n; i++){
        //     if(map.containsKey(digits[i]))
        //         map.put(digits[i], map.get(digits[i]) + 1);
        //     else{
        //         map.put(digits[i], 1);
        //         if(digits[i] % 2 == 0)
        //             evenNumbers ++;
        //     }
        // }
        
        // if(evenNumbers == 0){
        //     return 0;
        // }
        // if(!map.containsKey(0)){
        //     int prod = evenNumbers;
            
        // }

       /* int n = digits.length;
        int evenNumbers = 0;
        int zeros = 0;
        for(int i = 0; i < n; i++){
            if(digits[i] == 0)
                zeros ++;
            else if(digits[i] % 2 == 0)
                evenNumbers ++;
        }
        if(zeros == 0 && evenNumbers == 0){
            return factorial(n)/factorial(n - 3);
        }
        if(zeros == 0){ // nCevenNumbers + n-1C2 *2!
            return (factorial(n)/factorial(n-evenNumbers)/factorial(evenNumbers)) * 2*factorial(n - 1)/factorial(n - 3)/2;
        }
        if(evenNumbers == 0){ // 1 * (n - zeros)C1 * (n - zeros - 1)C1
            return (n - zeros)*(n - zeros - 1);
        }
        else{ // 0 -> 1 * (n - zeros)C1 * (n - 2)C1
              // even -> evenNumbersC1 * (n - zeros - 1)C1 * (n - 2)C1
              return (n - zeros) * (n - 2) +
                     evenNumbers * (n - zeros - 1) * (n - 2);
        }
        */
    }
}