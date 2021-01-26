package com.spring.conferenceWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.conferenceWebApp.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>
{

}
