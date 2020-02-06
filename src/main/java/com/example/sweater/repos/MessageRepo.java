package com.example.sweater.repos;

import com.example.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Todo: Описание класса
 *
 * @author Сергеев Максим Константинович {@literal <Sergeev.M.Konsta@sberbank.ru>}
 */
public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findByTag(String tag);

}
