package be.rabobank.training.menuservice.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MenuItem {

	private String ref;
	private String description;
	private double price;
}
