class Solution {
   public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = 0;
    for (int p : piles) right = Math.max(right, p);

    while (left < right) {
        int mid = (left + right) / 2;

        int hours = 0;
        for (int p : piles) {
            hours += (int) Math.ceil((double) p / mid);
        }

        if (hours <= h) {
            right = mid;
        } else {
            left = mid + 1;
        }
    }

    return left;
}
}
