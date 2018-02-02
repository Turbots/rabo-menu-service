package be.rabobank.training.menuservice.service;

import be.rabobank.training.menuservice.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MenuService {

	private final List<MenuItem> menu;

	public MenuService() {
		menu = Collections.singletonList(MenuItem.builder().ref("BIER").description("BIER").price(1.0).build());
	}

	public List<MenuItem> getMenu() {
		return menu;
	}

	public double getItemPrice(String ref) {
		return 1.0;
	}
}
