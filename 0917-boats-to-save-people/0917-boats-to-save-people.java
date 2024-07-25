class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int j=0;
        int count=0,temp=0;
        for(int i=people.length-1;i>=j;i--)
        {
            temp=people[i];
            if(people[j]<=limit-temp && j<i)
            {
                //temp+=people[j];
                j++;
            }
            count++;
        }
        return count;
    }
}