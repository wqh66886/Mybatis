package mybatis.entity;

import java.util.Date;

/**
 * @author: 王其浩
 * @ClassName: User
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public class User {
    private Integer id;

    private String username;

    private String password;

    private String status;

    private Date registerTime;

    public User() {
    }

    public User(Integer id, String username, String password, String status, Date registerTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.status = status;
        this.registerTime = registerTime;
    }
    public User(String username, String password, String status, Date registerTime) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.registerTime = registerTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", status=").append(status);
        sb.append(", registerTime=").append(registerTime);
        sb.append('}');
        return sb.toString();
    }
}
