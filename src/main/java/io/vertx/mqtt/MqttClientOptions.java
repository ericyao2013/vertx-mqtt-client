package io.vertx.mqtt;


import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;
import io.vertx.core.net.NetClientOptions;

/**
 * Represents options used by the MQTT client
 */
@DataObject
public class MqttClientOptions extends NetClientOptions {

  private static final int DEFAULT_PORT = 1883;
  private static final int DEFAULT_TSL_PORT = 8883;
  private static final String DEFAULT_HOST = "localhost";
  private static final int DEFAULT_WILL_QOS = 0;
  private static final int DEFAULT_KEEP_ALIVE_TIME_SECONDS = 30;
  private static final boolean DEFAULT_CLEAN_SESSION = true;
  private static final boolean DEFAULT_WILL_FLAG = false;
  private static final boolean DEFAULT_WILL_RETAIN = false;

  private int port = DEFAULT_PORT;
  private String host = DEFAULT_HOST;
  private String clientId;
  private String username;
  private String password;
  private String willTopic;
  private String willMessage;
  private boolean cleanSession = DEFAULT_CLEAN_SESSION;
  private boolean willFlag = DEFAULT_WILL_FLAG;
  private int willQoS = DEFAULT_WILL_QOS;
  private boolean willRetain = DEFAULT_WILL_RETAIN;
  private int keepAliveTimeSeconds = DEFAULT_KEEP_ALIVE_TIME_SECONDS;
  private boolean isAutoKeepAlive = true;

  /**
   * Default constructor
   */
  public MqttClientOptions() {
    super();
  }

  /**
   * Create an instance of MqttClientOptions from JSON
   *
   * @param json the JSON
   */
  public MqttClientOptions(JsonObject json) {
    super(json);
    //TODO implement this constructor
  }

  /**
   * Copy constructor
   *
   * @param other the options to copy
   */
  public MqttClientOptions(MqttClientOptions other) {
    super(other);
  }

  public MqttClientOptions setPort(int port) {
    this.port = port;
    return this;
  }

  public MqttClientOptions setHost(String host) {
    this.host = host;
    return this;
  }

  public String getHost() {
    return host;
  }

  public int getPort() {
    return port;
  }

  public boolean hasUsername() {
    return username != null;
  }

  public boolean hasPassword() {
    return password != null;
  }

  public boolean isCleanSession() {
    return cleanSession;
  }

  public boolean isWillFlag() {
    return willFlag;
  }

  public boolean isWillRetain() {
    return willRetain;
  }

  public int getWillQoS() {
    return willQoS;
  }

  public int getKeepAliveTimeSeconds() {
    return keepAliveTimeSeconds;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getClientId() {
    return clientId;
  }

  public String getWillTopic() {
    return willTopic;
  }

  public String getWillMessage() {
    return willMessage;
  }

  public MqttClientOptions setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public MqttClientOptions setUsername(String username) {
    this.username = username;
    return this;
  }

  public MqttClientOptions setPassword(String password) {
    this.password = password;
    return this;
  }

  public MqttClientOptions setWillTopic(String willTopic) {
    this.willTopic = willTopic;
    return this;
  }

  public MqttClientOptions setWillMessage(String willMessage) {
    this.willMessage = willMessage;
    return this;
  }

  public MqttClientOptions setCleanSession(boolean cleanSession) {
    this.cleanSession = cleanSession;
    return this;
  }

  public MqttClientOptions setWillFlag(boolean willFlag) {
    this.willFlag = willFlag;
    return this;
  }

  public MqttClientOptions setWillQoS(int willQoS) {
    this.willQoS = willQoS;
    return this;
  }

  public MqttClientOptions setWillRetain(boolean willRetain) {
    this.willRetain = willRetain;
    return this;
  }

  public MqttClientOptions setKeepAliveTimeSeconds(int keepAliveTimeSeconds) {
    this.keepAliveTimeSeconds = keepAliveTimeSeconds;
    return this;
  }

  /**
   * Set if the MQTT client mush handle PINGREQ automatically
   * (default is true)
   *
   * @param isAutoKeepAlive ping request handled automatically
   * @return  current options instance
   */
  public MqttClientOptions setAutoKeepAlive(boolean isAutoKeepAlive) {
    this.isAutoKeepAlive = isAutoKeepAlive;
    return this;
  }

  /**
   * @return if the PINGREQ is handled automatically
   */
  public boolean isAutoKeepAlive() {
    return this.isAutoKeepAlive;
  }

  @Override
  public MqttClientOptions setSsl(boolean ssl) {
    super.setSsl(ssl);
    return this;
  }
}
