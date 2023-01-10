public class ShipDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int maxCapacity = 0;
        int start = Integer.MAX_VALUE;
        for (int weight : weights) {
            start = Math.min(start,weight);
            maxCapacity += weight;
        }
        int end = maxCapacity;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (daysCount(weights, mid, days)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static boolean daysCount (int[] arr, int mid, int days) {
        int sum = 0;
        int dayCount = 1;
        for (int j : arr) {
            if(j > mid) {
                return false;
            }

            sum += j;
            if (sum > mid) {
                dayCount++;
                sum = j;
            }
        }
        return dayCount <= days;
    }
}
