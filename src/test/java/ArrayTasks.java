

public class ArrayTasks {
/*
Return the sum of the numbers in the array, except ignore sections of numbers starting
with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
Return 0 for no numbers.
 */
    public int sum67(int[] nums) {
        int sum =0;
        for(int i=0; i<nums.length; i++){
            if (nums[i]==6){
                nums[i]=0;
                while (nums[i+1]!=7){
                    nums[i+1]=0;
                    i++;
                }
                if (nums[i+1]==7){
                    nums[i+1]=0;
                }
            }
            sum +=nums[i];
        }
        return sum;

    }

    /*
    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
     */
    public boolean has22(int[] nums) {
    for(int i=0; i<nums.length-1; i++){
        if (nums[i]==2 && nums[i+1]==2)return true;
    }
        return false;
    }
    /*
    Given an array of ints, return true if the array contains no 1's and no 3's.
     */
    public boolean lucky13(int[] nums) {
        for (int i=0; i<nums.length; i++){
            if (nums[i]==1 || nums[i]==3)
            {return false;}

        }
        return  true;
    }
/*

Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
 */
public boolean sum28(int[] nums) {

    int sum = 0;
    for(int i=0; i<nums.length; i++){
        if (nums[i]==2){
            sum += nums[i];
        }
    }
    return (sum==8);

}


/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's
 */
public boolean more14(int[] nums) {
    int balance = 0;
    for(int i = 0; i < nums.length; i++)
    {
        if(nums[i] == 1)
            balance++;
        else if(nums[i] == 4)
            balance--;
    }
    return (balance > 0);
}
/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array.
 You do not need a separate if-statement for the length-0 case;
 the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length]
 */
public int[] fizzArray(int n) {
    int[] arr=new int[n];
    for (int i=0; i<n; i++){
        arr[i]=i;
    }
    return arr;
}

/*
Given an array of ints, return true if every element is a 1 or a 4.
 */
public boolean only14(int[] nums) {
    for (int i=0; i<nums.length;i++){
        if (nums[i]!=1 && nums[i]!=4){
            return false;
        }
    }
    return true;
}
/*

Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1.
 N may be 0, in which case just return a length 0 array.
 Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]
 */
public String[] fizzArray2(int n) {
    String[] arr = new String[n];
    for (int i=0; i<n; i++){
        arr[i]=String.valueOf(i);
    }
    return arr;
}

/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */
public boolean no14(int[] nums) {
    boolean noOne = true, noFour = true;
    for(int i = 0; i < nums.length && (noOne || noFour); i++)
    {
        if(nums[i] == 1)
            noOne = false;
        else if(nums[i] == 4)
            noFour = false;
    }
    return (noOne || noFour);
}

/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
 at least one of the pair is that value. Return true if the given value is everywhere in the array.
 */
public boolean isEverywhere(int[] nums, int val) {
    for(int i=0; i<nums.length-1; i++){
        if(nums[i]!=val && nums[i+1]!=val){
            return false;
        }
    }
    return true;
}
 /*
 Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
  */
 public boolean either24(int[] nums) {
    boolean has2 = false;
    boolean has4 = false;

    for (int i=0; i<nums.length-1; i++){
        if(nums[i]==2 && nums[i+1]==2){
            has2=true;
        }
        if(nums[i]==4 && nums[i+1]==4){
            has4=true;
        }

    }
    if (has2 && has4){
        return false;
    }
    return (has2 || has4);
 }
 /*
 Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
 Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
  */
 public int matchUp(int[] nums1, int[] nums2) {
    int count =0;
    for (int i=0; i<nums1.length; i++){
        if (Math.abs(nums1[i]-nums2[i])<=2 && (nums1[i]!=nums2[i])){
            count++;
        }
    }
    return count;
 }
 /*
 Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
 */
 public boolean has77(int[] nums) {
    for (int i=0; i<nums.length-1; i++){
        if (nums[i] == 7 && nums[i + 1] == 7 ) {
            return true;
        }
    }
    for (int i=0; i<nums.length-2; i++){
        if ((nums[i] == 7 && nums[i + 2] == 7)   ) {
            return true;
        }
    }
     return false;
 }
/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
 */
public boolean has12(int[] nums) {
    for(int i=0; i<nums.length;i++){
        if (nums[i]==1){
            for (int j=i+1; j<nums.length; j++){
                if (nums[j]==2){
                    return true;
                }
            }
        }
    }
    return false;
}
/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 */
public boolean modThree(int[] nums) {
for(int i=0; i<nums.length-2; i++){
    if (nums[i]%2==nums[i+1]%2 && nums[i+1]%2==nums[i+2]%2){
        return true;
    }
}
    return false;
}
/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 */
public boolean haveThree(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            if (i != nums.length) {
                if (nums[i] == nums[i + 1]) {
                    return false;
                }
            }
            count++;
        }
    }
    return count == 3;
}
    /*
    Given an array of ints, return true if every 2 that appears in the array is next to another 2.
     */
    public boolean twoTwo(int[] nums) {

    }
}
