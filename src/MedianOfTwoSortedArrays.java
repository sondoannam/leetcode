public class MedianOfTwoSortedArrays {
    public double solution(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        // initialize first median(m2) & second median(m1) will be two digit in a row in the merged array
        int m1 = 0, m2 = 0;
        // initialize two pointers to handle two matched arrays
        int p1 = 0, p2 = 0;

        // because we need the middle digits, so we need to loop [half of merged array length + 1]
        for (int i = 0; i <= (m + n) / 2; i++) {
            // for each loop, set the first median = second median before it moving to next digit
            m2 = m1;
            // if we're not done handle with both arrays
            if (p1 != m && p2 != n) {
                // 2 3 4 9 11
                // ^
                // 1 5 8
                // ^
                // 2 > 1 -> m1 = 1 & p2++;
                // ---
                // 2 3 4 9 11
                // ^
                // 1 5 8
                // --^
                // 2 < 5 -> m1 = 2 & p1++
                // --- three more times we'll get m1 = 5 & m2 = 4
                if (nums1[p1] < nums2[p2]) {
                    m1 = nums1[p1];
                    p1++;
                } else {
                    m1 = nums2[p2];
                    p2++;
                }
            } else if (p1 < m) {
                m1 = nums1[p1];
                p1++;
            } else {
                m1 = nums2[p2];
                p2++;
            }
        }

        if ((m + n) % 2 == 0) {
            return (double) (m1 + m2) / 2.0;
        } else {
            return m1;
        }
    }
}
