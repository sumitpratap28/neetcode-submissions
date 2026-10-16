class TimeMap {

    private static class Entry {
        int timestamp;
        String value;

        Entry(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private final Map<String, List<Entry>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<>())
           .add(new Entry(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Entry> list = map.get(key);
        if (list == null) return "";

        int left = 0;
        int right = list.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp <= timestamp) {
                result = list.get(mid).value; // candidate; try to find a later one
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}