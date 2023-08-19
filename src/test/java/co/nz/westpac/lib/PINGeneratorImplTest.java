package co.nz.westpac.lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNotNull;

import java.util.Set;
import org.junit.Test;

public class PINGeneratorImplTest {
    private final PINGenerator pinGenerator = PINGeneratorFactory.createPINGenerator();

    @Test
    public void shouldNotBeNullWhenBatchSizeIs0() {
        int pinBatchCount = 0;
        Set<String> result = pinGenerator.GeneratePINs(pinBatchCount);
        assumeNotNull(result);
    }

    @Test
    public void shouldGenerate0PINsWhenBatchSizeIs0() {
        int pinBatchCount = 0;
        Set<String> pinsBatch = pinGenerator.GeneratePINs(pinBatchCount);
        int generatedPINsCount = pinsBatch.size();
        assertEquals(pinBatchCount, generatedPINsCount);
    }

    @Test
    public void shouldGenerate0PINsWhenBatchSizeIsNegativeInteger() {
        int pinBatchCount = -8;
        int expectedBatchCount = 0;
        Set<String> pinsBatch = pinGenerator.GeneratePINs(pinBatchCount);
        int generatedPINsCount = pinsBatch.size();
        assertEquals(expectedBatchCount, generatedPINsCount);
    }

    @Test
    public void shouldGenerate1000PINsWhenBatchSizeIs1000() {
        int pinBatchCount = 1000;
        Set<String> pinsBatch = pinGenerator.GeneratePINs(pinBatchCount);
        int generatedPINsCount = pinsBatch.size();
        assertEquals(pinBatchCount, generatedPINsCount);
    }

    @Test
    public void shouldGenerate10000PINsWhenBatchSizeIsMoreThan10000() {
        int pinBatchCount = 12000;
        int expectedBatchCount = 10000;
        Set<String> pinsBatch = pinGenerator.GeneratePINs(pinBatchCount);
        int generatedPINsCount = pinsBatch.size();
        assertEquals(expectedBatchCount, generatedPINsCount);
    }
}
