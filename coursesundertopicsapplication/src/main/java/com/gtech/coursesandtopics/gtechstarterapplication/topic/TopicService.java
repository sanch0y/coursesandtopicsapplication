package com.gtech.coursesandtopics.gtechstarterapplication.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by G Tech on 11/6/2018.
 * <p/>
 * Markers : sign# are same
 */
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

//    private List<Course> topics = new ArrayList<>(Arrays.asList(
//            new Course("spring", "Spring Framework", "Spring Framework Description"),
//            new Course("java", "Core Java", "Core Java Description"),
//            new Course("javascript", "Basic Javascript", "Basic Javascript Description")
//    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        //Marker : sign_1
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        //Marker : sign_1 ends
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        //Marker : sign_1
//        for (int i = 0; i < topics.size(); i++) {
//            Course t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//            }
//        }
        //Marker : sign_1 ends
        topicRepository.save(topic);
    }

    public void removeTopic(String id) {
        //topics.removeIf(t -> t.getId().equals(id));
        topicRepository.delete(id);
    }
}
