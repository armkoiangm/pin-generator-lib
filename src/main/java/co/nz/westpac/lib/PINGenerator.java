package co.nz.westpac.lib;

import java.util.Set;

public interface PINGenerator {
    Set<String> GeneratePINs(Integer pinCount);
}