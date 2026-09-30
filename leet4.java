class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int x = nums1.length;
        int y = nums2.length;

        int s = 0;
        int e = x;

        while (s <= e) {

            int px = (s + e) / 2;
            int py = (x + y + 1) / 2 - px;

            // Left side
            int xl = (px == 0) ? Integer.MIN_VALUE : nums1[px - 1];
            int yl = (py == 0) ? Integer.MIN_VALUE : nums2[py - 1];

            // Right side
            int xr = (px == x) ? Integer.MAX_VALUE : nums1[px];
            int yr = (py == y) ? Integer.MAX_VALUE : nums2[py];

            // Correct partition
            if (xl <= yr && yl <= xr) {

                // Even number of elements
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(xl, yl)
                            + Math.min(xr, yr)) / 2;
                }

                // Odd number of elements
                else {
                    return Math.max(xl, yl);
                }
            }

            // px is too far right
            else if (xl > yr) {
                e = px - 1;
            }

            // px is too far left
            else {
                s = px + 1;
            }
        }

        return 0.0;
    }
}
