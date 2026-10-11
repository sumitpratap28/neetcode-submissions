
class Solution {

    // KYUN class?
    // Position aur speed ek hi car ke do hisse hain. Class mein bundle
    // karne se sort karte waqt dono hamesha saath rehte hain.
    // 2D array mein cars[i][0], cars[i][1] yaad rakhna padta, yahan
    // car.position aur car.speed seedha padh sakte hain.
    static class Car {
        int position;
        int speed;

        Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Car objects ka array banao
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        // KYUN position pe sort (speed pe nahi)?
        // Overtake allowed nahi hai, to road pe ORDER chahiye, aur order
        // position se pata chalta hai. Target ke paas wali car pehle,
        // isliye badi position pehle (descending).
        Arrays.sort(cars, (a, b) -> b.position - a.position);

        int fleets = 0;
        double lastTime = 0;   // aage wali fleet ka target tak time

        for (Car car : cars) {
            // Position aur speed ko ek hi cheez "time" mein badal do
            double time = (double) (target - car.position) / car.speed;

            // Zyada time = dheemi = catch nahi karegi = nayi fleet
            // Kam/barabar time = aage wali se mil jaayegi = merge
            if (time > lastTime) {
                fleets++;
                lastTime = time;
            }
        }
        return fleets;
    }
}
       
