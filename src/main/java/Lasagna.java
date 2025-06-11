public class Lasagna {
    // 1. Define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // 2. Define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    // 3. Define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return layers * 2; // 2 min per layer
    }

    // TODO: define the 'totalTimeInMinutes()' method
}
