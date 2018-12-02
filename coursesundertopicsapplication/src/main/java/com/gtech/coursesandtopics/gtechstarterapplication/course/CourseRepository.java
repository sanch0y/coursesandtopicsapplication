package com.gtech.coursesandtopics.gtechstarterapplication.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by G Tech on 11/7/2018.
 */
public interface CourseRepository extends CrudRepository<Course,String> {

    public List<Course> findByTopicId(String topicId);

}
