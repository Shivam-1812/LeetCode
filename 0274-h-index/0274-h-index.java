class Solution {
    public int hIndex(int[] citations) {

        //Sorting Method(most inuitive)
        //Time Complexity: O(N log N)
        Arrays.sort(citations);

        int h = 0;

        for(int i = citations.length - 1; i >= 0; i--) {
            if(citations[i] >= h + 1) {
                h++;
            }else {
                break;
            }
        }
        return h;        
    }
}