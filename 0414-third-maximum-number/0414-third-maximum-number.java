class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long Second = null;
        Long Third = null;

        for( int num : nums){
            if((first != null && first == num) ||
            (Second != null && Second == num )||
            (Third != null && Third == num)){
            continue; 
            }
            if(first == null || num> first ){
                Third = Second ;
                Second = first;
                first = (long) num;
            }
            else if (Second == null || num > Second){
                Third = Second;
                Second = first;
                Second = (long) num;
            }
            else if (Third == null || num > Third){
                Third = (long) num;
            }
        }
        return Third == null ? first.intValue() : Third.intValue();
        
    }
}