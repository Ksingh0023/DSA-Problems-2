class Solution {
    public int minJumps(int[] arr) {

        int n = arr.length;

        if (n == 1) return 0;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[n];

        q.offer(0);
        vis[0] = true;

        int step = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int i = q.poll();

                if (i == n - 1) return step;

                List<Integer> list = map.get(arr[i]);

                list.add(i - 1);
                list.add(i + 1);

                for (int x : list) {

                    if (x >= 0 && x < n && !vis[x]) {
                        vis[x] = true;
                        q.offer(x);
                    }
                }

                list.clear();
            }

            step++;
        }

        return -1;
    }
}  
