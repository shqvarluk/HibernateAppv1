package Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Posts {
    private int id;
    private String posts;
    private int idUser;
    private int idTag;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "posts")
    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    @Basic
    @Column(name = "iduser")
    public int getIdUser(){
        return idUser;
    }

    public void setIdUser(int idUser){
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "idtags")
    public int getIdTag(){
        return idTag;
    }

    public void setIdTag(int idTag){
        this.idTag = idTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Posts posts1 = (Posts) o;

        if (id != posts1.id) return false;
        if (posts != null ? !posts.equals(posts1.posts) : posts1.posts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (posts != null ? posts.hashCode() : 0);
        return result;
    }
}
