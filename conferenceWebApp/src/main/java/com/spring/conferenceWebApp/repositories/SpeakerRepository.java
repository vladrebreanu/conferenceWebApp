package com.spring.conferenceWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.conferenceWebApp.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>
{
}
