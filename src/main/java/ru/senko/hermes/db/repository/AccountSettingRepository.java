package ru.senko.hermes.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.senko.hermes.db.entity.AccountSetting;

@Repository
public interface AccountSettingRepository extends JpaRepository<AccountSetting, Long> {

}
