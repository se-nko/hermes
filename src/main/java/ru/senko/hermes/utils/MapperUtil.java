package ru.senko.hermes.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.val;
import org.springframework.beans.BeanUtils;
import ru.senko.hermes.db.entity.Account;
import ru.senko.hermes.web.dto.AccountDTO;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MapperUtil {

    public static Account entity(AccountDTO dto) {
        val entity = new Account();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    public static AccountDTO dto(Account entity) {
        val dto = new AccountDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }
}
