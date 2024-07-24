class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>  hm1=new HashMap<>();
        HashMap<Integer,Integer>  hm2=new HashMap<>();
        for(int i:nums1){
            if(hm1.containsKey(i)){
                hm1.put(i,hm1.get(i)+1);
            }
            else{
                hm1.put(i,1);
            }
        }
        for(int i:nums2){
            if(hm2.containsKey(i)){
                hm2.put(i,hm2.get(i)+1);
            }
            else{
                hm2.put(i,1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:hm1.keySet()){
            if (hm2.containsKey(i)){
                for(int j=0;j<Math.min(hm1.get(i),hm2.get(i));j++){
                    al.add(i);
                }
            }
        }
        int output[]=new int[al.size()];
        int j=0;
        for(int i: al)
        {
            output[j++]=i;
        }
        return output;
    }
}