package org.november.swimmer.dao;

import org.springframework.data.repository.CrudRepository;

public interface SurveyResponseRepository extends CrudRepository<SurveyResponse, Long> {
    public SurveyResponse findBySid(String sid);
}
