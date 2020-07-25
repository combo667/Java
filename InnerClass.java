/* THIS IS A PROGRAM FOR INNER CLASS DEMONSTRATION */

class ICDemo {
    int nums[];

    ICDemo(int n[]) {   //parameterised contructor
        this.nums = n;

    }

    void analyze() {
        inner ob1 = new inner();
        System.out.println("The minimum element is : " + ob1.min());
        System.out.println("The maximum element is : " + ob1.max());
        System.out.println("The average  is : " + ob1.avg());

    }

    class inner {

        int min() {
            int mini = nums[0];
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] < mini)
                    mini = nums[i];
            }
            return mini;
        }

        int max() {
            int maxi = nums[0];
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] > maxi)
                    maxi = nums[i];
            }

            return maxi;
        }

        int avg() {
            int sum = 0;
            for (int i = 0; i < nums.length; ++i)
                sum += nums[i];

            return sum / nums.length;
        }
    }

}

class InnerClass {
    public static void main(String[] args) {
        int nums[] = { 25, 11, 90, 45, 80, 21, 34 };
        ICDemo ic = new ICDemo(nums);
        ic.analyze();

    }
}