package ru.senko.hermes.web.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.senko.hermes.model.domain.Currency;

@Data
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class AccountSettingDTO {

    Long id;
    String strategyName;
    Currency currency;
    Double stopLossPercent;
    Double priceDifference;
    Integer dealsCount;
    Long maxDealTime;

}
