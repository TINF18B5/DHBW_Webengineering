package rechner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/rechner")
public class OKController {
	@PostMapping
	public String checkOK(CalculatorBean calculatorBean) {
		if (calculatorBean.getOK()) {
			return "Result";
		}
		return "Form";
	}

	@GetMapping
	public String start(CalculatorBean calculatorBean) {
		System.out.println(calculatorBean.toString());
		return "Form";
	}

}
