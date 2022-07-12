package jana60.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")


public class MainController {
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/ora")
	public String ora(Model model)
	{
		LocalDateTime ora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");
		String oraFormatted = ora.format(dtf);
		model.addAttribute("ora", oraFormatted);
		return "ora";
	}

}
