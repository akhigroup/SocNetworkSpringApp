package SocNetwork.models;

import SocNetwork.models.enums.Country;
import SocNetwork.models.enums.Gender;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collection;

/**
 * Created by aleksei on 11.02.17.
 */

@NodeEntity
public class User {

    @GraphId
    private Long id;

    @Property
    private String name;

    @Property
    private String email;

    @Property
    private String password;

    @Property
    private String photoLink;

    @Property
    private Integer age;

    @Property
    private Country country;

    @Property
    private Gender gender;

    @Property
    private String about;

    @Property
    private boolean online;

    @Relationship(type="HAS_ROLE", direction=Relationship.OUTGOING)
    private Collection<Role> roles;

    @Relationship(type="HAS_IN_FRIENDLIST", direction=Relationship.OUTGOING)
    private Collection<User> friendList;

    @Relationship(type="HAS_IN_BLACKLIST", direction=Relationship.OUTGOING)
    private Collection<User> blackList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public Collection<User> getBlackList() {
        return blackList;
    }

    public void setBlackList(Collection<User> blackList) {
        this.blackList = blackList;
    }

    public Collection<User> getFriendList() {
        return friendList;
    }

    public void setFriendList(Collection<User> friendList) {
        this.friendList = friendList;
    }
}
