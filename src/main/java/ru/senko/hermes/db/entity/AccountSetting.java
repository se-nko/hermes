package ru.senko.hermes.db.entity;

import lombok.Getter;
import lombok.Setter;
import ru.senko.hermes.model.domain.Currency;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "account_setting")
public class AccountSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_setting_id_seq")
    @SequenceGenerator(name = "account_setting_id_seq", sequenceName = "account_setting_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "strategy_name")
    private String strategyName;

    @Column(name = "currency")
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column(name = "stop_loss_percent")
    private Double stopLossPercent;

    @Column(name = "price_difference")
    private Double priceDifference;

    @Column(name = "deals_count")
    private Integer dealsCount;

    // milliseconds
    @Column(name = "max_deal_time")
    private Long maxDealTime;

}
