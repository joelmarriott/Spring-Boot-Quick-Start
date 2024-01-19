package io.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicDAO topicDAO;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicDAO.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        return topicDAO.findById(id);
    }

    public void addTopic(Topic topic) {
        topicDAO.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicDAO.save(topic);
    }

    public void deleteTopic(String id) {
        topicDAO.deleteById(id);
    }
}
