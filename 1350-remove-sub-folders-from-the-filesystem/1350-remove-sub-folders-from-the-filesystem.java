class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        ArrayList<String> folders = new ArrayList<>();
        String prev = "";
        for(int i = 0; i < folder.length; i++){
            if(prev.isEmpty() || !folder[i].startsWith(prev + "/")){
                folders.add(folder[i]);
                prev = folder[i];
            }
        }
        return folders;
    }
}