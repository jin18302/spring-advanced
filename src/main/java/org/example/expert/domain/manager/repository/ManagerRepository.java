package org.example.expert.domain.manager.repository;

import java.util.List;
import org.example.expert.domain.manager.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    List<Manager> findAllByTodoId(Long todoId);
}
