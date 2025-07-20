class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        HashSet<String> folders = new HashSet<>();
        for(int i = 0; i < folder.length; i++){
            if(folder[i] != null){
                folders.add(folder[i]);
                for(int j = i + 1; j < folder.length; j++){
                    if(folder[j] != null && folder[j].startsWith(folder[i] + "/")){
                        folder[j] = null;
                    }
                }
            }
        }
        return folders.stream().toList();
    }
}