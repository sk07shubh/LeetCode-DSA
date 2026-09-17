class Solution {
    public int totalFruit(int[] fruits) {

        int a = 0;
        int b = 0;
        int maxFruits = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        while (b < fruits.length) {

            map.put(fruits[b], map.getOrDefault(fruits[b], 0) + 1);

            while (map.size() > 2) {

                int fruit = fruits[a];

                map.put(fruit, map.get(fruit) - 1);

                if (map.get(fruit) == 0) {
                    map.remove(fruit);
                }

                a++;
            }

            maxFruits = Math.max(maxFruits, b - a + 1);

            b++;
        }

        return maxFruits;
    }
}