package co.nz.westpac.lib;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class PINGeneratorImpl implements PINGenerator {
    private final int UPPER_BOUND = 10000;
    private final int LOWER_BOUND = 0;
    private final int PINS_POSSIBLE_MAX_COUNT = 10000;

    private Random randNumGen;
    private Set<String> pinSet;

    public PINGeneratorImpl() {
        randNumGen = new Random();
        pinSet = new HashSet<String>();
    }

    @Override
    public Set<String> GeneratePINs(Integer pinCount) {
        if (pinCount < 1) {
            return pinSet;
        }

        while (pinSet.size() < pinCount) {
            int randomDigit = randNumGen.nextInt(LOWER_BOUND, UPPER_BOUND);
            String randomPin = String.format("%04d", randomDigit);
            pinSet.add(randomPin);

            if (pinSet.size() == PINS_POSSIBLE_MAX_COUNT) {
                break;
            }
        }

        return pinSet;
    }
}
