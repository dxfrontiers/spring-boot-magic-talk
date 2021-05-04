package de.digitalfrontiers.springboot.mina.autoconfigure;

import org.apache.sshd.server.SshServer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.FilteredClassLoader;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClassLoadingTest {

  @Test
  void testFilteredClassLoaderHidesSshServer() {

    final var classLoader = new FilteredClassLoader(SshServer.class);

    assertThrows(ClassNotFoundException.class, () -> {
      classLoader.loadClass("org.apache.sshd.server.SshServer");
    });
  }

  @Test
  void testSshServerClassLoadingWithDefaultClassLoader() {
    final var classLoader = getClass().getClassLoader();

    assertDoesNotThrow(() -> {
      classLoader.loadClass("org.apache.sshd.server.SshServer");
    });
  }
}
