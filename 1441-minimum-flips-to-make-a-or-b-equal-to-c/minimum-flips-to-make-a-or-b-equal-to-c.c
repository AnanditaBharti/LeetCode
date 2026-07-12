

int minFlips(int a, int b, int c){
    int flips = 0;
    while(a > 0 || b > 0 || c > 0){
        int r1 = a % 2;
        int r2 = b % 2;
        int r3 = c % 2;

        a = a / 2;
        b = b / 2;
        c = c / 2;

        int lhs = r1 | r2;
        int rhs = r3;

        if(lhs != rhs){
            if(rhs == 1)
                flips ++;
            else{
                if(r1 == 1)
                    flips ++;
                if(r2 == 1)
                    flips ++;
            }
        }
    }
    return flips;
}