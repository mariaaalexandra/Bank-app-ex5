package com.luxoft.bankapp.service.audit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EventConditionFilter {

    // Reading deposit limit from application.yml
    @Value("${audit.amount.deposit}")
    public double depositLimit;

    // Reading withdrawal limit from application.yml
    @Value("${audit.amount.withdrawal}")
    public double withdrawalLimit;

}
