package com.api.todosimple.repositores;

import com.api.todosimple.models.Task;
import com.api.todosimple.models.projection.TaskProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<TaskProjection> findByUser_Id(Long id);
}
