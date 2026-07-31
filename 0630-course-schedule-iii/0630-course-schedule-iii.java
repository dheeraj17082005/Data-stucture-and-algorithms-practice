class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> Integer.compare(a[1], b[1]));
 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        
        int totalTime = 0;
        
        for (int[] course : courses) {
            int duration = course[0];
            int lastDay = course[1];
    
            if (totalTime + duration <= lastDay) {
                totalTime += duration;
                maxHeap.offer(duration);
            } 
            else if (!maxHeap.isEmpty() && maxHeap.peek() > duration) {
                totalTime += duration - maxHeap.poll();
                maxHeap.offer(duration);
            }
        }
        return maxHeap.size();
    }
}