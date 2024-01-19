package io.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDAO extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);
}
