package be.rabobank.training.menuservice.web;

import be.rabobank.training.menuservice.model.MenuItem;
import be.rabobank.training.menuservice.service.MenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {

	private final MenuService menuService;

	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	@GetMapping
	public List<MenuItem> getMenu() {
		return this.menuService.getMenu();
	}

	@GetMapping(value = "/price", params = "ref")
	public double getItemPrice(@RequestParam("ref") String ref) {
		return this.menuService.getItemPrice(ref);
	}
}
