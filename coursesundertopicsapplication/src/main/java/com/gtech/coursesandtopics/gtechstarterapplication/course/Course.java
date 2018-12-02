package com.gtech.coursesandtopics.gtechstarterapplication.course;


import com.gtech.coursesandtopics.gtechstarterapplication.topic.Topic;

import javax.persistence.*;

/**
 * Created by G Tech on 11/5/2018.
 */
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Course() {
    }

    public Course(long id, String name, String description, Topic topic) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = topic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
