class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalSurplus = 0;
        int currentTank = 0;
        int StartingStation = 0;

        for(int i = 0; i < n; i++) {
            totalSurplus += gas[i] - cost[i];
            currentTank += gas[i] - cost[i];
            if(currentTank < 0) {
                currentTank = 0;
                StartingStation = i + 1;
            }
        }                
        return (totalSurplus < 0) ? -1 : StartingStation;
    }
}