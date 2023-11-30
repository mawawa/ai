package com.nano.AI.nanoAI;

import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface repo extends JpaRepository<Nano,Long> {


}
