package io.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseDAO.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id) {
        return courseDAO.findById(id);
    }

    public void addCourse(Course course) {
        courseDAO.save(course);
    }

    public void updateCourse(Course course) {
        courseDAO.save(course);
    }

    public void deleteCourse(String id) {
        courseDAO.deleteById(id);
    }
}
