package config;

public class ApiUserConfig {
    public static String host="https://todo.ly";
    public static String user="examen2@gmail.com";
    public static String pwd="123456";

    public static final String CREATE_USER=host+"/api/user.json";
    public static final String UPDATE_USER=host+"/api/user/{id}.json";
    public static final String DELETE_USER=host+"/api/user/{id}.json";
    public static final String READ_USER=host+"/api/user.json";
}
