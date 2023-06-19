class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<>();
        int value =0;
        list.add(value);
        for(int i =0; i<gain.length;i++)
        {
            value= value + gain[i];
            list.add(value);
        }
        return Collections.max(list);     
    }
}
