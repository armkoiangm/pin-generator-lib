package co.nz.westpac.lib;

public class PINGeneratorFactory {
    private PINGeneratorFactory() {
    }

    public static PINGenerator createPINGenerator() {
        return new PINGeneratorImpl();
    }
}
