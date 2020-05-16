package com.hubspot.slack.client.models.interaction.views;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

import java.time.LocalDate;

@Value.Immutable
@HubSpotStyle
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public interface ViewDatePickerIF extends ViewInput {
  LocalDate getSelectedDate();
}
