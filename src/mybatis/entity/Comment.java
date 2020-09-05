package mybatis.entity;

import java.util.Date;

/**
 * @author: 王其浩
 * @ClassName: Comment
 * @Description:
 * @Date 2020/9/5
 * @version:
 */
public class Comment {
    private Integer id;

    private String content;

    private int state;

    private Integer parseCount;

    private Date createTime;

    private Date updateTime;


    private User user;

    public Comment() {
    }

    public Comment(Integer id, String content, int state, Integer parseCount, Date createTime, Date updateTime, User user) {
        this.id = id;
        this.content = content;
        this.state = state;
        this.parseCount = parseCount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getParseCount() {
        return parseCount;
    }

    public void setParseCount(Integer parseCount) {
        this.parseCount = parseCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Comment{");
        sb.append("id=").append(id);
        sb.append(", content='").append(content).append('\'');
        sb.append(", state=").append(state);
        sb.append(", parseCount=").append(parseCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }
}
