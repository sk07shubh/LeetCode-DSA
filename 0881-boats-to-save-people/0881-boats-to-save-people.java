class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        Arrays.sort(people);
        int a=0,b=n-1;
        int minBoat = 0;
        while(a<=b){
            if(people[a] + people[b] <= limit ){
                a++;
            }
            b--;
            minBoat++;
        }
        return minBoat;
        
    }
}