package ru.senko.hermes.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.val;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtil {

    @SneakyThrows
    public static <E, D> E entity(Class<E> entityClass, D dto) {
        val entity = entityClass.getDeclaredConstructor().newInstance();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    @SneakyThrows
    public static <E, D> D dto(Class<D> dtoClass, E entity) {
        val dto = dtoClass.getDeclaredConstructor().newInstance();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

}
