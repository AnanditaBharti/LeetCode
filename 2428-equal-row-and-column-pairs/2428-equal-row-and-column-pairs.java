class Solution {
    class Entry{
        int hashValue ;
        String array ;
        Entry(int[] arr){
            this.hashValue = Arrays.hashCode(arr);
            this.array = Arrays.toString(arr) ;
        }
        @Override
        public boolean equals(Object obj){
            if (this == obj)
               return true ;
            if (obj == null || obj.getClass() != this.getClass())
               return false ;
            Entry e = (Entry) obj ;
            return hashValue == e.hashValue && array.equals(e.array) ;
        }
        @Override
        public int hashCode() {
            return Objects.hash(hashValue, array);
        }
    }


    public int equalPairs(int[][] grid) {
        if ( grid.length != grid[0].length ){
            return 0 ;
        }
        HashMap<Entry,Integer> hashCodeOfRows = new HashMap<>() ;
    HashMap<Entry,Integer> hashCodeOfColumns = new HashMap<>() ;
    for(int[] row : grid){
        Entry entry = new Entry(row) ; 
        hashCodeOfRows.put(entry , hashCodeOfRows.getOrDefault(entry,0) + 1 ) ;
    }

    for ( int i = 0 ; i < grid.length ; i++ ){
            int[] column = new int[grid.length] ;
            for ( int j = 0 ; j < grid[0].length ; j++ ){
                column[j] = grid[j][i] ;
            }
            Entry entry = new Entry(column) ; 
            hashCodeOfColumns.put(entry, hashCodeOfColumns.getOrDefault(entry,0) + 1 ) ;
    }

    int count = 0 ;
    for (Entry e : hashCodeOfRows.keySet()){
        if (hashCodeOfColumns.containsKey(e)){
            count +=  hashCodeOfRows.get(e) * hashCodeOfColumns.get(e) ;
        }
    }
    return count ;
    
    }
}