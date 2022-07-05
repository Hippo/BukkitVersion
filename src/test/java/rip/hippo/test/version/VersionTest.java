package rip.hippo.test.version;

import org.junit.jupiter.api.Test;
import rip.hippo.version.BukkitVersion;

/**
 * @author Hippo
 */
public final class VersionTest {


  @Test
  public void test() {
    BukkitVersion version188 = new BukkitVersion(1, 8, 8);
    BukkitVersion version116 = new BukkitVersion(1, 16);
    BukkitVersion version119 = new BukkitVersion(1, 19);

    assert version116.isGreaterThan(version188);
    assert version116.isLessThan(version119);
    assert version188.isLessThan(version116);
  }

}
