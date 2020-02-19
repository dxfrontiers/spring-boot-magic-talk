package de.digitalfrontiers.springboot.mina.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties(prefix = "mina.sshd")
public class SSHDProperties {

  /**
   * The port on which the SSH server will be available.
   */
  private int port = 8022;

  /**
   * A list of username and password pairs.
   */
  private List<UserDetail> users;

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public List<UserDetail> getUsers() {
    return users;
  }

  public void setUsers(List<UserDetail> users) {
    this.users = users;
  }

  public static class UserDetail {
    private String username;
    private String password;

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
  }
}

