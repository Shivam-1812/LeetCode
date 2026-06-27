//Approach 1 : Sorting Method(Most Inituitive)
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

//Approach 2 : Bucket Sort
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n+1];

        for(int c : citations){
            if(c >= n) {
                bucket[n]++;
            } else {
                bucket[c]++;
            }
        }

        int count = 0;
        for(int i = n; i >= 0; i--) {
            count += bucket[i];
            if(count >= i) {
                return i; 
            }
        }
    return 0;
    }
}
