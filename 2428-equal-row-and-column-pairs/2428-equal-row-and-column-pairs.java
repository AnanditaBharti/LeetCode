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
        // int countPairs = 0 ;
        // HashMap<Integer,Integer> hashCodeOfRows = new HashMap<>() ;
        // HashMap<Integer,Integer> hashCodeOfColumns = new HashMap<>() ;
        // for(int[] row : grid){
        //     int hashValue = Arrays.hashCode(row) ;
        //     System.out.println(hashValue) ;
        //     hashCodeOfRows.put( hashValue , hashCodeOfRows.getOrDefault(hashValue,0) + 1 ) ;
        // }
        // System.out.println("#") ;
        // for ( int i = 0 ; i < grid.length ; i++ ){
        //     int[] column = new int[grid.length] ;
        //     for ( int j = 0 ; j < grid[0].length ; j++ ){
        //         column[j] = grid[j][i] ;
        //     }
        //     int hashValue = Arrays.hashCode(column) ;
        //     System.out.println(hashValue) ;
        //     hashCodeOfColumns.put( hashValue , hashCodeOfColumns.getOrDefault(hashValue,0) + 1 ) ;
        // }

        // for ( Integer key : hashCodeOfRows.keySet() ){
        //     if ( hashCodeOfColumns.containsKey(key) ){
        //         countPairs += hashCodeOfRows.get(key) * hashCodeOfColumns.get(key) ;
        //     }
        // }
        // return countPairs ;


        // HashMap<String,Integer> rows = new HashMap<>() ;
        // for ( int i = 0 ; i < grid.length ; i++){
        //     String row = "" ;
        //     for ( int j = 0 ; j < grid.length ; j++){
        //         row += grid[i][j] ;
        //     }
        //     rows.put (row , rows.getOrDefault( row , 0 ) + 1) ;
        // }

        // HashMap<String,Integer> columns = new HashMap<>() ;
        // for ( int i = 0 ; i < grid.length ; i++){
        //     String col = "" ;
        //     for ( int j = 0 ; j < grid.length ; j++){
        //         col += grid[j][i] ;
        //     }
        //     columns.put (col , columns.getOrDefault( col , 0 ) + 1) ;
        // }

        // int result = 0 ;
        // for (String r : rows.keySet() ){
        //     if (columns.containsKey( r )){
        //         result += rows.get(r) * columns.get(r) ;
        //     }
        // }
        // return result ;

        // for ( int i = 0 ; i < grid.length ; i++){
        //     int hashRow = Arrays.hashCode(grid[0]) ;
        //     int[] col = new int[grid.length] ;
        //     for ( int j = 0 ; j < grid.length ; j++){
        //         col[j] = grid[j][i] ;
        //     }
        //     int hashCol = Arrays.hashCode(col) ;
        //     if (hashRow == hashCol){

        //     }
        //     rows.put (row , rows.getOrDefault( row , 0 ) + 1) ;
        // }

        // HashMap<Integer,Integer> hashCodeOfRows = new HashMap<>() ;
        // HashMap<Integer,Integer> hashCodeOfColumns = new HashMap<>() ;
        // for(int[] row : grid){
        //     int hashValue = Arrays.hashCode(row) ;
        //     hashCodeOfRows.put( hashValue , hashCodeOfRows.getOrDefault(hashValue,0) + 1 ) ;
        // }
        // System.out.println("#") ;
        // for ( int i = 0 ; i < grid.length ; i++ ){
        //     int[] column = new int[grid.length] ;
        //     for ( int j = 0 ; j < grid[0].length ; j++ ){
        //         column[j] = grid[j][i] ;
        //     }
        //     int hashValue = Arrays.hashCode(column) ;
        //     System.out.println(hashValue) ;
        //     hashCodeOfColumns.put( hashValue , hashCodeOfColumns.getOrDefault(hashValue,0) + 1 ) ;
    //     HashMap<Integer,List<Integer>> hashCodeOfRows = new HashMap<>() ;
    //     HashMap<Integer,List<Integer>> hashCodeOfColumns = new HashMap<>() ;
    //     for(int[] row : grid){
    //         int hashValue = Arrays.hashCode(row) ;

    //         hashCodeOfRows.put( hashValue , hashCodeOfRows.getOrDefault(hashValue,0) + 1 ) ;
    //     }
    // }
    // boolean checkTwoArraysAreEqual(int[] arr1, int[] arr2){
    //     for ( int i = 0 ; i < arr1.length ; i++){
    //         if ( arr1[i] != arr2[i])
    //             return false ;
    //     }
    //     return true ;


    
    }
}